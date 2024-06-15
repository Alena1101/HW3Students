package com.alena;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       TeacherController teacherController = new TeacherController();
       teacherController.create("Petr", "Ivanov", "Alekseevich");
       teacherController.create("Ivan", "Ivanov", "Petrovich");
       teacherController.create("Alice", "Sidorova", "Alekseevna");
       teacherController.create("Pavel", "Petrov", "Sergeevich");
       List<Teacher> teacherList = teacherController.getTeacherList();
       Teacher teacher = teacherList.get(1);
       teacherController.edit(teacher.getTeacherId(), "Maksim", "Andreev", "Aleksandrovich");
        System.out.println("------------------");
       teacherController.getTeacherList();

    }
}
