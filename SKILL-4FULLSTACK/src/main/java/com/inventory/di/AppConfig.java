package com.inventory.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student1 studentA() {
        // Constructor injection
        Student1 s = new Student1(201, "Ravi", "Java", 2);

        // Setter injection (at least two fields)
        s.setCourse("Spring Core");
        s.setYear(3);

        return s;
    }

    @Bean
    public Student1 studentB() {
        return new Student1(202, "Priya", "DevOps", 4);
    }
}
