package org.obrii.mit.dp2021.jurilents.laba2.students;

import java.util.List;

public interface IStudent {
    int getId();

    String getName();

    String getRole();

    char getSex();

    List<IStudent> getFriends();

    void addFriend(IStudent student);
}
