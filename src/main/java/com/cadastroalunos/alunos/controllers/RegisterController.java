package com.cadastroalunos.alunos.controllers;

import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.repositories.SportModalRepository;
import com.cadastroalunos.alunos.repositories.StudentRepository;
import com.cadastroalunos.alunos.services.SportModalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SportModalRepository sportModalRepository;


    @GetMapping("/cadastro")
    public String register(Model model) {
        List<SportModal> sportModalList = sportModalRepository.findAll();
        model.addAttribute("sportList", sportModalList);
        return "register";
    }

    @PostMapping("/cadastro")
    public String register(@ModelAttribute ("student") Student student, SportModal sportModal){
        sportModal = sportModalRepository.findById(sportModal.getId()).orElse(null);
        student.setSportModal(sportModal);
        studentRepository.save(student);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("list");
        List<Student> studentList = studentRepository.findAll();
        mv.addObject("studentList", studentList);
        return mv;
    }
}
