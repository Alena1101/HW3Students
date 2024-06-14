package com.alena;

public class Student implements Comparable <Student>{
    public Long getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    private Long studentId;

    public Student(Long studentId, String firstName, String lastName, String middleName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    private String firstName;
    private String lastName;
    private String middleName;

    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.getStudentId());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
