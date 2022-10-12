package com.example.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam= new Student(1L,"Mariam", LocalDate.of(2000, Month.JULY,17),
                    "mariam.jamal@gmail.com");
            Student alex= new Student("Alex", LocalDate.of(2004, Month.SEPTEMBER,27),
                    "alex@gmail.com");
            Student julia= new Student("Julia", LocalDate.of(2001, Month.OCTOBER,1),
                    "julia.Fink@gmail.com");

            studentRepository.saveAll(Arrays.asList(mariam,alex,julia));

        };
    }

}
