package com.alena.model;

import com.alena.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup extends UserGroup<Teacher> {
    private final List<Teacher> teacherList = new ArrayList<>();
    @Override
    public void createUser(String firstName, String lastName, String middleName) {
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    @Override
    public List<Teacher> getList() {
        return teacherList;
    }


}
