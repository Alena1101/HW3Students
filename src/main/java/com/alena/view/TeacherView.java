package com.alena.view;

import com.alena.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        System.out.println("Список учителей:");
        for (Teacher teacher: list){
            System.out.println(teacher);

        }
    }
}
