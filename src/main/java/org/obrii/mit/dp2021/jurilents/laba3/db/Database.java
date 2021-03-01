package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.Config;
import org.obrii.mit.dp2021.jurilents.laba3.data.IData;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

public abstract class Database {
    protected static File file = new File(Config.DATABASE_PATH);

    protected IDbProvider<IData> db;

    protected Database(IDbProvider<IData> dbProvider) {
        this.db = dbProvider;
    }

    public abstract void createData(HttpServletRequest req);
    public abstract IData[] readAllData();
    public abstract void updateData(HttpServletRequest req);
    public abstract void deleteData(HttpServletRequest req);

    public static TodosDatabase getDatabase() {
        IDbProvider<IData> provider = new FileDbProvider<>(file);
        return new TodosDatabase(provider);
    }
}
