package com.example.recyclerviewjamilton.activity.activity.model;

public class Filmes {

    private String titleFilme;
    private String year;
    private String genero;

    public Filmes(String titleFilme, String year, String genero) {
        this.titleFilme = titleFilme;
        this.year = year;
        this.genero = genero;
    }

    public String getTitleFilme() {
        return titleFilme;
    }

    public void setTitleFilme(String titleFilme) {
        this.titleFilme = titleFilme;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
