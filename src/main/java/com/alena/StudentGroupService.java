package com.alena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup();
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (firstName.equals(student.getFirstName())&&lastName.equals(student.getLastName())&&middleName.equals(student.getMiddleName())) {
                iterator.remove();
            }
                    }
    }
    public List<Student> getSortedStudentList () {
        List<Student> list = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(list);
        return list;
    }
    public List<Student> getSortedStudentListByFIO () {
        List<Student> list = new ArrayList<>(studentGroup.getStudentList());
        list.sort(new UserComparator<Student>());
        return list;
    }
    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
