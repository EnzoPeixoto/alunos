package com.cadastroalunos.alunos.resources;


import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.entities.Student;
import com.cadastroalunos.alunos.services.SportModalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    @PostMapping
    public ResponseEntity<SportModal> insert (@RequestBody SportModal obj){
        obj = sportModalService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        sportModalService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
