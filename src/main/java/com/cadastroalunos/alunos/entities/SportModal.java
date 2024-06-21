package com.cadastroalunos.alunos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "db_sport")
public class SportModal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sportName;


    public SportModal() {
    }

     public SportModal(Long id, String sportName) {
        this.id = id;
        this.sportName = sportName;
    }

    public SportModal(String sportName){
        this.sportName = sportName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String modal) {
        this.sportName = modal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportModal that = (SportModal) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
