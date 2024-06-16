package com.alena.model;

import java.util.Random;

public class Teacher extends User {
    private final long teacherId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Teacher{");
        sb.append("teacherId=").append(teacherId);
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", middleName='").append(getMiddleName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public long getId() {
        return teacherId;
    }

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        teacherId = new Random().nextLong();
    }
}
