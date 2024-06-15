package com.alena;

import java.util.List;

public class TeacherService {
    private final TeacherGroup teacherGroup = new TeacherGroup();
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        teacherGroup.editTeacher(teacherId, firstName, lastName, middleName);
    }

    public List<Teacher> getTeacherList() {
        return teacherGroup.getTeacherList();
    }
}
