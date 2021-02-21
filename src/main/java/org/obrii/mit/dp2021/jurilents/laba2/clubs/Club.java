package org.obrii.mit.dp2021.jurilents.laba2.clubs;

import org.obrii.mit.dp2021.jurilents.laba2.students.IStudent;

import java.util.ArrayList;
import java.util.List;

public abstract class Club implements IClub {
    //region Private fields

    private String id;
    private int roomNumber;
    private String name;
    private String description;
    private List<IStudent> participants;

    //endregion


    //region Constructors

    public Club() { }

    public Club(String id, int roomNumber, String name, String description) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.name = name;
        this.description = description;
        this.participants = new ArrayList<>();
    }


    //endregion

    //region Public methods

    @Override
    final public boolean join(IStudent student) {
        if (isParticipant(student)) return false;
        participants.add(student);
        return true;
    }

    //endregion


    //region Encapsulated methods

    final protected boolean isParticipant(IStudent student) {
        if (student == null) return false;
        return participants.contains(student);
    }

    //endregion


    //region Accessors

    public String getId() { return id; }
    public int getRoomNumber() { return roomNumber; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public List<IStudent> getParticipants() { return participants; }

    //endregion
}
