package com.alena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup(List.of(
            new Student(0L, "Pavel", "Ivanov", ""),
            new Student(115616598L, "Mihail", "Petrov", ""),
            new Student(565L, "Aleksandra", "Anisimova", ""),
            new Student(4587565L, "Maksim", "Antonov", "Petrovich"),
            new Student(45L, "Maksim", "Antonov", "Sergeevich")
    ));
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
        list.sort(new StudentComparator());
        return list;
    }
}
