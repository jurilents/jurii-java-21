package org.obrii.mit.dp2021.jurilents.laba2.students;

public enum SexType {
    Male('m'), Female('f');


    private char key;

    public char getCharKey() {
        return key;
    }

    SexType(char key) {
        this.key = key;
    }
}
