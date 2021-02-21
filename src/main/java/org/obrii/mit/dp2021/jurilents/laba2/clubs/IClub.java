package org.obrii.mit.dp2021.jurilents.laba2.clubs;

import org.obrii.mit.dp2021.jurilents.laba2.students.IStudent;

public interface IClub {
    String useStuff(IStudent student);

    String useStuff(IStudent student, String stuffName);

    boolean join(IStudent student);

    String getId();

    String getName();
}
