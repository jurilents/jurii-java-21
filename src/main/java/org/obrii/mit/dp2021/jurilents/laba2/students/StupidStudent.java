package org.obrii.mit.dp2021.jurilents.laba2.students;

import org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub;

public class StupidStudent extends StudentBase {
    public StupidStudent(int id, String name, SexType sex, IClub club) {
        super(id, name, sex, club);
    }

    public StupidStudent(int id, String name, SexType sex) {
        super(id, name, sex, null);
    }

    @Override
    public String getRole() {
        return "Stupid Student";
    }
}
