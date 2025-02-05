package com.example.sistema_livraria.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Editora")
public class Editora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    UUID id;

    @NotNull
    String nome;
}
