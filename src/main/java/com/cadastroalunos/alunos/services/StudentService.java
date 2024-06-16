package com.cadastroalunos.alunos.services;
import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll(){
        return repository.findAll();
    }

    public Student findById(Long id){
        Optional<Student> obj = repository.findById(id);
        return obj.get();
    }

}
