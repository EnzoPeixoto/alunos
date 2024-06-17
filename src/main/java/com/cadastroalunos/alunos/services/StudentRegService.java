package com.cadastroalunos.alunos.services;

import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.repositories.SportModalRepository;
import com.cadastroalunos.alunos.repositories.StudentRepository;
import com.cadastroalunos.alunos.resources.SportModalResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class StudentRegService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SportModalRepository sportModalRepository;

    @Autowired
    private SportModalService sportModalService;

    public void studentReg(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome completo do aluno: ");
        String name = sc.nextLine();

        System.out.print("Digite a idade dele: ");
        Integer age = sc.nextInt();
        sc.nextLine();

        System.out.print("Email do responsável: ");
        String email = sc.next();

        sportModalService.printSports();
        System.out.print("Digite o ID da modalidade desejada: ");
        Long sportId = sc.nextLong();

        SportModal sportModal = sportModalRepository.findById(sportId).orElseThrow(() -> new RuntimeException("Modalidade esportiva não encontrada"));

        Student student = new Student(null, name, age, email, sportModal);

        studentRepository.save(student);

        System.out.println("Aluno cadastrado com sucesso!");

    }
}
