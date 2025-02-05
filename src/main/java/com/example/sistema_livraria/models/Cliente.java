package com.example.sistema_livraria.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private UUID id;

    @NotNull
    private String nome;

    private String fidelidade;

    @NotNull
    private String cpf;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(String fidelidade) {
        this.fidelidade = fidelidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
