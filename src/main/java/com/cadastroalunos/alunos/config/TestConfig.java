package com.cadastroalunos.alunos.config;

import com.cadastroalunos.alunos.repositories.SportModalRepository;
import com.cadastroalunos.alunos.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SportModalRepository sportModalRepository;


    @Override
    public void run(String... args) throws Exception {

    }
}
