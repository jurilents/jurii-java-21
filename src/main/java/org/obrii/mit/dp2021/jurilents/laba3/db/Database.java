package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.laba3.data.IData;
import org.obrii.mit.dp2021.jurilents.laba3.data.ToDoTask;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;

public abstract class Database {
    protected IDbProvider<IData> db;

    protected Database(IDbProvider<IData> dbProvider) {
        this.db = dbProvider;
    }

    public abstract void createData(HttpServletRequest req) throws SQLException;
    public abstract IData[] readData(HttpServletRequest req) throws SQLException;
    public abstract void updateData(HttpServletRequest req) throws IOException, SQLException;
    public abstract void deleteData(HttpServletRequest req) throws IOException, SQLException;
    public abstract void generateData(int count) throws SQLException;

    public static TodosDatabase getDatabase()  {
        // File file = new File(Config.getFileName());
        // if (!file.exists()) file.createNewFile();
        // IDbProvider<IData> provider = new FileDbProvider<>(file);

//        try {
//            IDbProvider<IData> provider = new PostgresqlDbProvider<>(new ToDoTask());
//            return new TodosDatabase(provider);
//        }
//        catch (SQLException | DataFormatException e) {
//            System.out.println("Error: " + e);
//            return null;
//        }

        IDbProvider<IData> provider = new SpringDbProvider<>();
        return new TodosDatabase(provider);
    }

    protected static Map<String, String> getBody(HttpServletRequest request) {
        try {
            Map<String, String> data = new HashMap<>();
            BufferedReader reader = request.getReader();
            reader.lines().forEach((String line) -> {
                for (String item : line.split("&")) {
                    String[] pair = item.split("=");
                    data.put(pair[0], pair[1].replace('+', ' '));
                }
            });
            return data;
        } catch (IOException ex) {
            System.out.println("Exception handled: " + ex);
            return null;
        }
    }
}
