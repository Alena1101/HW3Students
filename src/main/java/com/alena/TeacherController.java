package com.alena;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
        @Override
    public void create(String firstName, String lastName, String middleName) {
           teacherService.createTeacher(firstName, lastName, middleName);


    }
    public void edit(Long teacherId, String firstName, String lastName, String middleName) {
            teacherService.editTeacher(teacherId, firstName, lastName, middleName);
    }
    public List<Teacher> getTeacherList () {
        List<Teacher> teacherList = teacherService.getTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
}
