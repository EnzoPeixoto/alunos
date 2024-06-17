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
    private StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(Long id){
        Optional<Student> obj = studentRepository.findById(id);
        return obj.get();
    }

    public Student insert (Student obj){
        return studentRepository.save(obj);
    }

    public void delete (Long id){
        studentRepository.deleteById(id);
    }

    public Student update(Long id, Student obj){
        Student entity = studentRepository.getReferenceById(id);
        updateData(entity, obj);
        return studentRepository.save(entity);
    }

    public void updateData(Student entity, Student obj){
        entity.setName(obj.getName());
        entity.setAge(obj.getAge());
        entity.setEmail(obj.getEmail());
    }
}
