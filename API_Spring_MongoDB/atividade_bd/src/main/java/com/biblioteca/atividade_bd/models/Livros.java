package com.biblioteca.atividade_bd.models;

public class Livros {

    private String id;
    private String titulo;
    private String autor;
    private String ano_publi;
    private String genero;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno_publi() {
        return ano_publi;
    }

    public void setAno_publi(String ano_publi) {
        this.ano_publi = ano_publi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
