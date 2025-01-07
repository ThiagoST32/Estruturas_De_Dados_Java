package com.dio.dioProjects_BootCamp.Lista;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadada = new ListaEncadeada<>();

        minhaListaEncadada.add("Elemento 1");
        minhaListaEncadada.add("Elemento 2");
        minhaListaEncadada.add("Elemento 3");
        minhaListaEncadada.add("Elemento 4");
        minhaListaEncadada.add("Elemento 5");

        System.out.println(minhaListaEncadada.isEmpty());
        System.out.println(minhaListaEncadada);
        System.out.println(minhaListaEncadada.removeNo(3));
        System.out.println(minhaListaEncadada);
    }
}
