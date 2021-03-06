package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.laba3.data.IData;
import org.obrii.mit.dp2021.jurilents.laba3.data.ToDoTask;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class TodosDatabase extends Database {

    protected TodosDatabase(IDbProvider<IData> dbProvider) {
        super(dbProvider);
    }

    @Override
    public void createData(HttpServletRequest req) {
        ToDoTask todo = new ToDoTask(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("name")
        );

        db.create(todo);
    }

    @Override
    public IData[] readAllData() {
        return db.read().toArray(new IData[0]);
    }

    @Override
    public void updateData(HttpServletRequest req) {
        IData todo = new ToDoTask(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("name"),
                req.getParameter("completed").equals("true")
        );

        db.update(todo);
    }

    @Override
    public void deleteData(HttpServletRequest req) throws IOException {
        int id = Integer.parseInt(getBody(req).get("id"));
        db.delete(id);
    }
}
