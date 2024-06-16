package com.cadastroalunos.alunos.config;

import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student(null, "Matheus Augusto", 12, "mariajose043@gmail.com");
        Student student2 = new Student(null, "Gabriela Augusto", 9, "mariajose043@gmail.com");

        studentRepository.saveAll(Arrays.asList(student1, student2));

    }
}
