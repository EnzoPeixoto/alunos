package com.cadastroalunos.alunos.services;

import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.repositories.SportModalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class SportRegService {
    @Autowired
    private SportModalRepository sportModalRepository;

    public void sportReg(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do esporte que deseja adicionar: ");
        String sport = sc.nextLine();

        SportModal sportModal = new SportModal(null, sport);

        sportModalRepository.save(sportModal);

        System.out.println("Modalidade esportiva cadastrada com sucesso!");

    }
}
