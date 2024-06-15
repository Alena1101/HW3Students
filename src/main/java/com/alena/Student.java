package com.alena;

public class Student extends User implements Comparable <Student>{
    public Long getStudentId() {
        return studentId;
    }



    private Long studentId;


    public Student(Long studentId, String firstName, String lastName, String middleName) {
        super(firstName,lastName, middleName);
        this.studentId = studentId;

    }



    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.getStudentId());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", middleName='").append(getMiddleName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
