package org.obrii.mit.dp2021.jurilents.laba2.clubs;

import org.obrii.mit.dp2021.jurilents.laba2.Tools;
import org.obrii.mit.dp2021.jurilents.laba2.students.IStudent;

public class MusicClub extends Club {
    public MusicClub(String id, int roomNumber, String name, String description) {
        super(id, roomNumber, name, description);
    }

    @Override
    public String useStuff(IStudent student) {
        IStudent st = Tools.getRandomItemFrom(student.getFriends());
        return isParticipant(student)
                ? String.format("%s got lost walking among musical instruments and started running in a panic", student.getName())
                : String.format("%s was mesmerized by %s's playing on a musical instrument!", student.getName(), st);
    }

    @Override
    public String useStuff(IStudent student, String stuffName) {
        return String.format("%s plays %s", student.getName(), stuffName);
    }
}
