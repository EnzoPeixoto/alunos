package com.cadastroalunos.alunos;

import com.cadastroalunos.alunos.services.SportRegService;
import com.cadastroalunos.alunos.services.StudentRegService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class AlunosApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AlunosApplication.class, args);

		Scanner sc = new Scanner(System.in);


		System.out.print("1 - Cadastrar aluno\n2 - Adicionar modalidade: ");
		int i = sc.nextInt();

		if (i == 1) {
				StudentRegService studentRegService = context.getBean(StudentRegService.class);
				studentRegService.studentReg();
		} else {
				SportRegService sportRegService = context.getBean(SportRegService.class);
				sportRegService.sportReg();
		}
	}
}
