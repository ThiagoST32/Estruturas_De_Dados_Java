package com.dio.dioProjects_BootCamp.Set;

import java.util.*;

public class SetOrdenacao {
    public static void main(String[] args) {
        Set<Serie> series = new HashSet<>() {{
            add(new Serie("Titan", 36, "Desenho"));
            add(new Serie("Maverick", 48, "Ação"));
            add(new Serie("Governo", 60, "Comédia"));
        }};
        for (Serie serie : series) System.out.println("Ordem aleatoria -> " + serie);
        System.out.println("\n");
        Set<Serie> series2 = new LinkedHashSet<>() {{
            add(new Serie("Titan", 36, "Desenho"));
            add(new Serie("Maverick", 48, "Ação"));
            add(new Serie("Governo", 60, "Comédia"));
        }};
        for (Serie serie : series2) System.out.println("Ordem de Inserção -> " + serie);
        System.out.println("\n");
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie : series2) System.out.println("Ordem de natural Eps -> " + serie.getEps());
        System.out.println("\n");
        Set<Serie> series4 = new TreeSet<>(new ComparadorNomeEpsGenero());
        series4.addAll(series);
        for (Serie serie : series4) System.out.println("Ordem Nome, Genero e Eps -> " + serie);
    }
}

class ComparadorNomeEpsGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ){
            return nome;
        }
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0){
            return genero;
        }
        return Integer.compare(s1.getEps(), s2.getEps());
    }
}