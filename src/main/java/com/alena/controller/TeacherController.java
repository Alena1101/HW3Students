package com.alena.controller;

import com.alena.model.Student;
import com.alena.model.Teacher;
import com.alena.service.TeacherService;
import com.alena.view.TeacherView;
import com.alena.view.UserView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    //Доступ к методу вывода списка учителей в консоль через интерфейс
    private final UserView<Teacher> teacherView = new TeacherView();
        @Override
    public void create(String firstName, String lastName, String middleName) {
           teacherService.createTeacher(firstName, lastName, middleName);


    }
    @Override
    public void edit(Long teacherId, String firstName, String lastName, String middleName) {
            teacherService.editTeacher(teacherId, firstName, lastName, middleName);
    }
    @Override
    public List<Teacher> getList () {
        List<Teacher> teacherList = teacherService.getTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
    public List<Teacher> getSortedTeacherList () {

        List<Teacher> sortedTeacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(sortedTeacherList);
        return sortedTeacherList;

    }
    public List<Teacher> getSortedTeacherListByFIO () {
        List<Teacher> sortedTeacherList = teacherService.getSortedTeacherListByFIO();
        teacherView.sendOnConsole(sortedTeacherList);
        return sortedTeacherList;
    }
}
