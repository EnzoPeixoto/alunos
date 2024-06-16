package com.cadastroalunos.alunos.resources;


import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.services.SportModalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sports")
public class SportModalResource {

    @Autowired
    private SportModalService sportModalService;

    @GetMapping
    public ResponseEntity<List<SportModal>> findAll(){
        List<SportModal> list = sportModalService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SportModal> findById(@PathVariable Long id){
        SportModal obj = sportModalService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
