package com.dio.dioProjects_BootCamp.Map;

import com.dio.dioProjects_BootCamp.Map.Domain.Compare;
import com.dio.dioProjects_BootCamp.Map.Domain.Livro;

import java.util.*;

public class MainLivro {
    public static void main(String[] args) {

        Compare compare = new Compare();

        Map<String, Livro> livros = new HashMap<>(){{
            put("Carros",(new Livro("Carro", 100)));
            put("Carros2",(new Livro("Carros2", 120)));
            put("Carros3",(new Livro("Carros3", 140)));
        }};
        System.out.println("--- \tOrdem Aleatorioa\t ---");
        System.out.println(livros);

        for(Map.Entry<String, Livro> livro: livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--- \tOrdem de inserção\t ---");
        Map<String, Livro> livros2 = new LinkedHashMap<>(){{
            put("Carros",(new Livro("Carro", 100)));
            put("Carros2",(new Livro("Carros2", 120)));
            put("Carros3",(new Livro("Carros3", 140)));
        }};
        System.out.println(livros2);


        System.out.println("--- \tOrdem Alfabética\t ---");
        Map<String, Livro> livros3 = new TreeMap<>(){{
            put("Carros",(new Livro("Carro", 100)));
            put("Carros2",(new Livro("Carros2", 120)));
            put("Carros3",(new Livro("Carros3", 140)));
        }};
        System.out.println(livros3);

        Set<Map.Entry<String, Livro>> entries = new TreeSet<>(compare);
        entries.addAll(livros3.entrySet());
        System.out.println(entries.toString());


    }
}
