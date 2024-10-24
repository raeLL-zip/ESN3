package com.example.universidadeESN3.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Professor {
    private Long id;
    private Long matricula;
    private String nome;
}
