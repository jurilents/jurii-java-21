package org.obrii.mit.dp2021.jurilents.laba3.data;

import java.io.Serializable;

public class ToDoTask implements Serializable, IData {
    private int id;
    private String name;
    private boolean isCompleted;

    public ToDoTask(int id, String name) {
        this(id, name, false);
    }

    public ToDoTask(int id, String name, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
}
