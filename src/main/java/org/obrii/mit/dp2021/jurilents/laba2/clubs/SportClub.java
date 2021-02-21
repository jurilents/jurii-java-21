package org.obrii.mit.dp2021.jurilents.laba2.clubs;

import org.obrii.mit.dp2021.jurilents.laba2.Tools;
import org.obrii.mit.dp2021.jurilents.laba2.students.IStudent;

public class SportClub extends Club {
    public SportClub(String id, int roomNumber, String name, String description) {
        super(id, roomNumber, name, description);
    }

    @Override
    public String useStuff(IStudent student) {
        if (isParticipant(student)) {
            return String.format("%s procrastinated for 3 hours looking at the gym wall", student.getName());
        } else {
            IStudent st = Tools.getRandomItemFrom(getParticipants());
            student.getFriends().add(st);
            st.getFriends().add(student);
            return String.format("%s broke someone's arm and went to the infirmary", student.getName());
        }
    }

    @Override
    public String useStuff(IStudent student, String stuffName) {
        String wt = student.getSex() == 'm' ? "he" : "she";
        String pref = String.format("Although %s was not a member of the club, ", wt);

        switch (stuffName) {
            case "Ball":
                return pref + String.format("%s played with balls", student.getName());

            case "Pool":
                return pref + String.format("%s swam in the pool", student.getName());

            case "Uniform":
                if (Tools.randomInt(0, 10) >= 7) {
                    return pref + String.format("%s watched everyone go in for sports because %s forgot the uniform", student.getName(), wt);
                } else if (student.getFriends().size() > 0) {
                    StringBuilder fds = new StringBuilder();
                    for (IStudent f : student.getFriends()) {
                        fds.append(f.getName()).append(", ");
                    }

                    String fdsStr = fds.substring(0, fds.length() - 2);
                    return pref + String.format("%s played with %s on the playground", student.getName(), fdsStr);
                } else {
                    return String.format("%s is so lonely...", student.getName());
                }

            default:
                return String.format("Nobody knows what %s was up to all the time...", student.getName());

        }
    }
}
