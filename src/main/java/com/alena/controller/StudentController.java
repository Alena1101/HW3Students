package com.alena.controller;

import com.alena.model.Stream;
import com.alena.model.Student;
import com.alena.service.StreamService;
import com.alena.service.StudentGroupService;
import com.alena.view.StudentView;
import com.alena.view.UserView;

import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();
    //Доступ к методу вывода списка студентов в консоль через интерфейс
    private final UserView<Student> studentView = new StudentView();
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList () {

        List<Student> sortedStudentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(sortedStudentList);
        return sortedStudentList;

    }
    public List<Student> getSortedStudentListByFIO () {
        List<Student> sortedStudentList = studentGroupService.getSortedStudentListByFIO();
        studentView.sendOnConsole(sortedStudentList);
        return sortedStudentList;
    }
    public List<Stream> getSortedStreamListByCount() {
        return streamService.getSortedStreamListByCount();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);

    }

    @Override
    public void edit(Long studentId, String firstName, String lastName, String middleName) {
        studentGroupService.editStudent(studentId, firstName, lastName, middleName);
    }
    @Override
    public List<Student> getList () {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
}
