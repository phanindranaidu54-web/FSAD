package com.inventory.di;

public class Student1 {
    private int studentId;
    private String name;
    private String course;
    private int year;

    // Constructor Injection (all fields)
    public Student1(int studentId, String name, String course, int year) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Setter Injection (at least two fields)
    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student { studentId=" + studentId +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year + " }";
    }
}
