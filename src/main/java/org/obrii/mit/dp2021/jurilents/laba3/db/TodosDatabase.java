package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.laba3.CollectionUtils;
import org.obrii.mit.dp2021.jurilents.laba3.data.IData;
import org.obrii.mit.dp2021.jurilents.laba3.data.ToDoTask;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class TodosDatabase extends Database {

    protected TodosDatabase(IDbProvider<IData> dbProvider) {
        super(dbProvider);
    }

    @Override
    public void createData(HttpServletRequest req) throws SQLException {
        ToDoTask todo = new ToDoTask(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("name")
        );

        db.create(todo);
    }

    @Override
    public IData[] readData(HttpServletRequest req) throws SQLException {
        ToDoTask[] data = db.read().toArray(new ToDoTask[0]);
        String matchingText = req.getParameter("text");

        // apply filters
        Stream<ToDoTask> stream = Arrays.stream(data);

        String by = req.getParameter("by");
        if (by != null) {
            if (by.equals("id")) {
                stream = stream.filter(a -> String.format("%d", a.getId()).contains(matchingText));
                System.out.println("by id");
            } else if (by.equals("task")) {
                stream = stream.filter(a -> a.getName().contains(matchingText));
                System.out.println("by task desc");
            }
        }
        String completedText = req.getParameter("completed");
        if (completedText != null && !completedText.equals("all")) {
            stream = completedText.equals("yes")
                    ? stream.filter(toDoTask -> toDoTask.isCompleted())
                    : stream.filter(a -> !a.isCompleted());
            System.out.println("by completed");
        }

        return stream.toArray(size -> new IData[size]);
    }

    @Override
    public void updateData(HttpServletRequest req) throws SQLException {
        Map<String, String> data = getBody(req);
        IData todo = new ToDoTask(
                Integer.parseInt(data.get("id")),
                data.get("name"),
                data.get("completed").equals("true")
        );

        db.update(Integer.parseInt(data.get("oldId")), todo);
    }

    @Override
    public void deleteData(HttpServletRequest req) throws SQLException {
        int id = Integer.parseInt(getBody(req).get("id"));
        db.delete(id);
    }

    @Override
    public void generateData(int count) throws SQLException {
        List<String> names = new ArrayList<>();
        names.add("Do something");
        names.add("Play football");
        names.add("Jump around the room");
        names.add("Go to shop");
        names.add("Buy a new house");
        names.add("Visit my granny");
        names.add("Be happy");
        names.add("Dont worry");
        names.add("Create a new object instance");
        names.add("Fix bug on prod");
        names.add("Make a pool/request");
        names.add("Cook the food");
        names.add("Wash a wild cock");
        names.add("Wash my woolf");
        names.add("By the way...");
        names.add("Make Yermakov a team lead ");
        names.add("Eat everything");
        names.add("Play with balls on the street");
        names.add("Fly like a fly");
        names.add("XoX");
        names.add("Wow!");
        names.add("Some text");
        names.add("Go to the bed");
        names.add("Go to the bad");
        names.add("Sleep");
        names.add("Goggle it");
        names.add("Be healthy");
        names.add("Listen a music");
        names.add("Queueueueue");
        names.add("Swimming pool!");
        names.add("Bla-bla-bla");
        names.add("Hello, World!");
        names.add("Hello 123");
        names.add("Text");
        names.add("Test");
        names.add("The last one!!!");

        for (int i = 0; i < count; i++) {
            ToDoTask todo = new ToDoTask(
                    CollectionUtils.randomInt(1, 1000),
                    CollectionUtils.getRandomItemFrom(names),
                    false
            );
            db.create(todo);
        }
    }
}
