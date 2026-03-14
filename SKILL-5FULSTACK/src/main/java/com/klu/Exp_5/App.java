package com.klu.Exp_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // Load Spring IoC Container using Java Configuration
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Student bean
        Student student = context.getBean(Student.class);

        // Print details
        System.out.println(student);
    }
}
