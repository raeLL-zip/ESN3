package com.example.universidadeESN3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long matricula;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Genero genero;
}
