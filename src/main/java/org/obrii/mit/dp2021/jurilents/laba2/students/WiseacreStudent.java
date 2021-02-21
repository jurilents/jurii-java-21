package org.obrii.mit.dp2021.jurilents.laba2.students;

import org.obrii.mit.dp2021.jurilents.laba2.Tools;
import org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub;

public class WiseacreStudent extends StudentBase {

    public WiseacreStudent(int id, String name, SexType sex, IClub club) {
        super(id, name, sex, club);
    }

    public WiseacreStudent(int id, String name, SexType sex) {
        super(id, name, sex, null);
    }

    @Override
    public String getRole() {
        int val = Tools.randomInt(120, 150);
        return String.format("Wiseacre Student %s [IQ%d+]", name, val);
    }

}
