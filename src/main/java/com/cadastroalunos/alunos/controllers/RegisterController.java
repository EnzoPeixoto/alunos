package com.cadastroalunos.alunos.controllers;

import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.repositories.SportModalRepository;
import com.cadastroalunos.alunos.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SportModalRepository sportModalRepository;

    @GetMapping("/cadastro")
    public String register(Model model) {
        List<SportModal> sportModals = sportModalRepository.findAll(); // Supondo que você tenha um serviço para obter todos os SportModals.
        model.addAttribute("sportModals", sportModals);
        return "register";
    }

    @PostMapping("/cadastro")
    public String register(@ModelAttribute ("student") Student student,@ModelAttribute ("sportModal") String sportId){
        Long parseId = Long.parseLong(sportId);
        SportModal sportModal = sportModalRepository.findById(parseId).orElse(null);
        student.setSportModal(sportModal);
        studentRepository.save(student);
        return "register";
    }
}
