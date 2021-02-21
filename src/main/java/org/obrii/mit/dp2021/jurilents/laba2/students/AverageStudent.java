package org.obrii.mit.dp2021.jurilents.laba2.students;

import org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub;

public class AverageStudent extends StudentBase {
    public AverageStudent(int id, String name, SexType sex) {
        super(id, name, sex, null);
    }

    public AverageStudent(int id, String name, SexType sex, IClub club) {
        super(id, name, sex, club);
    }

    @Override
    public String getRole() {
        return "Someone Unknown";
    }
}
