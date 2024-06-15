package com.alena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private final List<Student> studentList = new ArrayList<>();




    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    public void createStudent(String firstName, String lastName, String middleName) {
        studentList.add(new Student(0L, firstName, lastName, middleName));
    }
}
