package com.cadastroalunos.alunos.repositories;

import com.cadastroalunos.alunos.entities.SportModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportModalRepository extends JpaRepository<SportModal, Long> {
}
