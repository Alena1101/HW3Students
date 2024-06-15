package com.alena;

import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();
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
}
