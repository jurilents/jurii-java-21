package org.obrii.mit.dp2021.jurilents.laba3.data;

import org.obrii.mit.dp2021.jurilents.laba3.db.annotations.DbField;
import org.obrii.mit.dp2021.jurilents.laba3.db.annotations.DbTable;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

@DbTable(name = "todos")
public class ToDoTask implements Serializable, IData {

    @DbField(name = "id", opts = "integer primary key not null")
    private int id;

    @DbField(name = "name", opts = "text not null")
    private String name;

    @DbField(name = "completed", opts = "boolean not null default 0")
    private boolean isCompleted;


    public ToDoTask() {}

    public ToDoTask(int id, String name) {
        this(id, name, false);
    }

    public ToDoTask(int id, String name, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }


    public static ToDoTask parse(ResultSet rs) throws SQLException {
        return new ToDoTask(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getBoolean("completed")
        );
    }


    public int getId() { return id; }

    @Override
    public String getValues() {
        return String.format("%d, %s, %d", id, name, isCompleted ? 1 : 0);
    }

    @Override
    public String getKeysAndValues() {
        return String.format("id = %d, name = %s, completed = %d", id, name, isCompleted ? 1 : 0);
    }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
}
