package com.dio.dioProjects_BootCamp.Set;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private int eps;
    private String genero;

    public Serie(String nome, int eps, String genero) {
        this.nome = nome;
        this.eps = eps;
        this.genero = genero;
    }

    public Serie() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return eps == serie.eps && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eps, genero);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", eps=" + eps +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public int compareTo(Serie serie) {
        int genero = this.getGenero().compareTo(serie.getGenero());
        int eps = Integer.compare(this.getEps(), serie.getEps());
        if (eps != 0){
            return eps;
        }
        return genero;
    }

}
