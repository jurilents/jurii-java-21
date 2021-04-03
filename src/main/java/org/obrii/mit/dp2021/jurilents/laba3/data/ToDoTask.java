package org.obrii.mit.dp2021.jurilents.laba3.data;

import org.obrii.mit.dp2021.jurilents.laba3.db.annotations.DbField;
import org.obrii.mit.dp2021.jurilents.laba3.db.annotations.DbTable;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

@Entity
@DbTable(name = "todos")
public class ToDoTask implements Serializable, IData<ToDoTask> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DbField(name = "id", opts = "integer primary key not null")
    private int id;

    @DbField(name = "name", opts = "text not null")
    private String name;

    @DbField(name = "completed", opts = "boolean not null default false")
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


    public ToDoTask parse(ResultSet rs) throws SQLException {
        return new ToDoTask(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getBoolean("completed")
        );
    }


    public int getId() { return id; }

    @Override
    public void setAll(ToDoTask instance) {
        this.setId(instance.getId());
        this.setName(instance.getName());
        this.setCompleted(instance.isCompleted());
    }

    @Override
    public String getValues() {
        return String.format("%d, '%s', %s", id, name, isCompleted ? "true" : "false");
    }

    @Override
    public String getKeysAndValues() {
        return String.format("id = %d, name = '%s', completed = %s", id, name, isCompleted ? "true" : "false");
    }

    @Override
    public String toString() {
        return "ToDoTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
}
