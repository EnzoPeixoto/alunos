package com.cadastroalunos.alunos.repositories;

import com.cadastroalunos.alunos.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
