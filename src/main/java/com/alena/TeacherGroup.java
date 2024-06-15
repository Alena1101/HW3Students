package com.alena;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    private final List<Teacher> teacherList = new ArrayList<>();
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
      for (Teacher teacher: teacherList) {
          if (teacherId == teacher.getTeacherId()) {
              teacher.setFirstName(firstName);
              teacher.setLastName(lastName);
              teacher.setMiddleName(middleName);
              break;
          }
      }
    }
}
