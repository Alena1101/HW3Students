package com.alena.service;

import com.alena.model.User;
import com.alena.model.UserGroup;
import com.alena.utils.SortHelper;
import com.alena.utils.UserComparator;
import com.alena.model.Student;
import com.alena.model.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    // Теперь доступ к StudentGroup через интерфейс UserGroup
    private final UserGroup<Student> studentGroup = new StudentGroup();
    private final SortHelper<Student> sortHelper = new SortHelper<Student>();
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        Iterator<User> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (firstName.equals(user.getFirstName())&&lastName.equals(user.getLastName())&&middleName.equals(user.getMiddleName())) {
                iterator.remove();
            }
                    }
    }
    public List<Student> getSortedStudentList () {
        //Поскольку метод getSortedList принимает на входе параметр типа UserGroup,
        //то мы можем передать в этот метод поле StudentGroup,
        //который является объектом типа StudentGroup.
        return sortHelper.getSortedList(studentGroup);
    }
    public List<Student> getSortedStudentListByFIO () {
        return sortHelper.getSortedListByFIO(studentGroup);
    }
    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createUser(firstName, lastName, middleName);
    }

    public void editStudent(Long studentId, String firstName, String lastName, String middleName) {
        studentGroup.editUser(studentId, firstName, lastName, middleName);
    }
}
