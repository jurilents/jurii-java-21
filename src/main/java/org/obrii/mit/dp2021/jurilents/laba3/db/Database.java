package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.Config;
import org.obrii.mit.dp2021.jurilents.laba3.data.IData;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Database {
    protected static File file = new File(Config.getFileName());

    protected IDbProvider<IData> db;

    protected Database(IDbProvider<IData> dbProvider) {
        this.db = dbProvider;
    }

    public abstract void createData(HttpServletRequest req);
    public abstract IData[] readData(HttpServletRequest req);
    public abstract void updateData(HttpServletRequest req) throws IOException;
    public abstract void deleteData(HttpServletRequest req) throws IOException;
    public abstract void generateData(int count);

    public static TodosDatabase getDatabase() {
        IDbProvider<IData> provider = new FileDbProvider<>(file);
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
