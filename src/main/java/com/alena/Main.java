package com.alena;

import com.alena.controller.StudentController;
import com.alena.controller.TeacherController;
import com.alena.controller.UserController;
import com.alena.model.Student;
import com.alena.model.Teacher;
import com.alena.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Теперь переменная userController определяется только один раз при создании,
        //а остальной код универсальный.
       UserController<Student> userController = new StudentController();
       //UserController<Teacher> userController = new TeacherController();
       userController.create("Petr", "Ivanov", "Alekseevich");
       userController.create("Ivan", "Ivanov", "Petrovich");
       userController.create("Alice", "Sidorova", "Alekseevna");
       userController.create("Pavel", "Petrov", "Sergeevich");
       User user = userController.getList().get(1);
       userController.edit(user.getId(), "Maksim", "Andreev", "Aleksandrovich");
        System.out.println("------------------");
       userController.getList();

    }
}
