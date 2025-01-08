package com.dio.dioProjects_BootCamp.ListasCirculares;

public class Main {
    public static void main(String[] args) {
        ListasCirculares<String> listaCircular = new ListasCirculares<>();

        listaCircular.add("A1");
        listaCircular.add("A2");
        listaCircular.add("A3");
        listaCircular.add("A4");
        listaCircular.add("A5");

        System.out.println(listaCircular);

        listaCircular.remove(2);
        System.out.println(listaCircular);
        listaCircular.add("A7");
        System.out.println(listaCircular);
        System.out.println(listaCircular.get(0));
    }
}
