package com.ezequielbolzi.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student marian = new Student(
                    1L,
                    "Marian",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, OCTOBER, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2004, NOVEMBER, 5)
            );

        repository.saveAll(
                List.of(marian,alex)
        );
        };
    }

}
