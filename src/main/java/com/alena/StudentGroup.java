package com.alena;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private final List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }


    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
