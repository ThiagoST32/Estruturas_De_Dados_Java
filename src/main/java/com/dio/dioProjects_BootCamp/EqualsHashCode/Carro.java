package com.dio.dioProjects_BootCamp.EqualsHashCode;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
    String nome;

    public Carro() {
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(nome, carro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        return this.getNome().compareTo(o.nome);
    }

//    @Override
//    public int compareTo(Carro o) {
//        if (this.nome.length() < o.nome.length()){
//            return -1;
//        } else if (this.nome.length() > o.nome.length()){
//            return 1;
//        }
//        return 0;
//    }
}
