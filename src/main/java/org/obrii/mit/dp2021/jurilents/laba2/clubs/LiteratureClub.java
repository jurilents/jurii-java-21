package org.obrii.mit.dp2021.jurilents.laba2.clubs;


import org.obrii.mit.dp2021.jurilents.laba2.Tools;
import org.obrii.mit.dp2021.jurilents.laba2.students.IStudent;

public class LiteratureClub extends Club {
    public LiteratureClub(String id, int roomNumber, String name, String description) {
        super(id, roomNumber, name, description);
    }

    @Override
    public String useStuff(IStudent student) {
        return isParticipant(student)
                ? String.format("%s read the book", student.getName())
                : getAttitudeToOther(student);
    }

    @Override
    public String useStuff(IStudent student, String stuffName) {
        if (!isParticipant(student)) return getAttitudeToOther(student);

        switch (stuffName) {
            case "Book":
                return useStuff(student);

            case "FriendShoulder":
                IStudent[] gfs = (IStudent[]) student.getFriends().stream()
                        .filter(s -> s.getSex() != student.getSex()).toArray();

                if (gfs.length > 0) {
                    IStudent gf = Tools.getRandomItemFrom(gfs);
                    return String.format("%s read the book with %s until deep into the night...", student.getName(), gf.getName());
                }
                return String.format("%s does not available to found any gf anywhere", student);

            default:
                return getAttitudeToOther(student);
        }
    }

    private String getAttitudeToOther(IStudent student) {
        return String.format("%s was expelled from an unfamiliar room №%d", student.getName(), getRoomNumber());
    }
}
