package com.example.atividade_avaliativa_n1;

import java.io.Serializable;

public class AtividadeComplementar implements Serializable {
    private String nome;
    private String email;
    private String descricao;
    private String cargaHoraria;
    private String categoria;

    public AtividadeComplementar(String nome, String email, String descricao, String cargaHoraria, String categoria) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Descrição: " + descricao + "\n" +
                "Carga Horária: " + cargaHoraria + "\n" +
                "Categoria: " + categoria;
    }
}
