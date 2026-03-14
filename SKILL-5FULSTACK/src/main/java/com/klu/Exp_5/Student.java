package com.klu.Exp_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 1;
    private String name = "Yaswanth";
    private String gender = "Male";

    private Certification certification;

    @Autowired
    public Student(Certification certification) {
        this.certification = certification;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", gender=" + gender +
                ", " + certification + "]";
    }
}