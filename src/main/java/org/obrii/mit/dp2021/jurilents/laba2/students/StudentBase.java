package org.obrii.mit.dp2021.jurilents.laba2.students;

import org.obrii.mit.dp2021.jurilents.laba2.clubs.IClub;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

public abstract class StudentBase implements IStudent {
    final protected int id;
    final protected String name;
    final protected SexType sex;
    final protected List<IStudent> friends;


    public StudentBase(int id, String name, SexType sex, @Null IClub club) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.friends = new ArrayList<>();
        if (club != null) club.join(this);
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char getSex() {
        return sex.getCharKey();
    }

    @Override
    public List<IStudent> getFriends() {
        return friends;
    }

    @Override
    public void addFriend(IStudent student) {
        friends.add(student);
    }
}
