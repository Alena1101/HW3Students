package com.alena.model;

public class Student extends User implements Comparable <Student>{
    @Override
    public long getId() {
        return studentId;
    }



    private final long studentId;


    public Student(long studentId, String firstName, String lastName, String middleName) {
        super(firstName,lastName, middleName);
        this.studentId = studentId;

    }



    @Override
    public int compareTo(Student o) {
        return Long.compare(studentId, o.getId());
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
