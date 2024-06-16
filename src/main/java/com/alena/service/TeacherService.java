package com.alena.service;

import com.alena.model.*;
import com.alena.utils.SortHelper;

import java.util.List;

public class TeacherService {
    // Теперь доступ к TeacherGroup через интерфейс UserGroup
    private final UserGroup<Teacher> teacherGroup = new TeacherGroup();
    private final SortHelper<Teacher> sortHelper = new SortHelper<Teacher>();
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createUser(firstName, lastName, middleName);
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        teacherGroup.editUser(teacherId, firstName, lastName, middleName);
    }

    public List<Teacher> getTeacherList() {
        return teacherGroup.getList();
    }
    public List<Teacher> getSortedTeacherList () {
        return sortHelper.getSortedList(teacherGroup);
    }
    public List<Teacher> getSortedTeacherListByFIO () {
        //Поскольку метод getSortedList принимает на входе параметр типа UserGroup,
        //то мы можем передать в этот метод поле TeacherGroup,
        //который является объектом типа TeacherGroup.
        return sortHelper.getSortedListByFIO(teacherGroup);
    }
}
