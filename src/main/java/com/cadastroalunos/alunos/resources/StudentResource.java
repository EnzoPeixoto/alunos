package com.cadastroalunos.alunos.resources;

import com.cadastroalunos.alunos.entities.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {

    @GetMapping
    public ResponseEntity<Student> findAll(){
        Student one = new Student(1L, "João Pinheiro", 12, "mariasilva13@yahoo.com");
        return ResponseEntity.ok().body(one);
    }
}
