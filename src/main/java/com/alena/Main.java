package com.alena;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        List<Student> studentList1 = controller.getSortedStudentList();
        System.out.println("Сортированный список студентов1: ");
        for (Student student: studentList1) {
            System.out.println(student);
        }
        List<Student> studentList2 = controller.getSortedStudentListByFIO();
        System.out.println("Сортированный список студентов2: ");
        for (Student student: studentList2) {
            System.out.println(student);
        }

    }
}
