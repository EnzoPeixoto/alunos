package com.cadastroalunos.alunos.services;

import com.cadastroalunos.alunos.entities.SportModal;
import com.cadastroalunos.alunos.repositories.SportModalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class SportModalService {

    @Autowired
    private SportModalRepository sportModalRepository;

    public List<SportModal> findAll(){
        return sportModalRepository.findAll();
    }

    public SportModal findById(Long id){
        Optional<SportModal> obj = sportModalRepository.findById(id);
        return obj.get();
    }

    public SportModal insert (SportModal obj){
        return sportModalRepository.save(obj);
    }

    public void delete(Long id){
        sportModalRepository.deleteById(id);
    }
}
