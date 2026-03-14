package com.inventory.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student1 s1 = (Student1) ctx.getBean("student1");
        Student1 s2 = (Student1) ctx.getBean("student2");

        System.out.println("XML Bean student1 -> " + s1);
        System.out.println("XML Bean student2 -> " + s2);

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
