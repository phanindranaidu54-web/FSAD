package com.inventory.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Student1 a = ctx.getBean("studentA", Student1.class);
        Student1 b = ctx.getBean("studentB", Student1.class);

        System.out.println("Annotation Bean studentA -> " + a);
        System.out.println("Annotation Bean studentB -> " + b);

        ctx.close();
    }
}
