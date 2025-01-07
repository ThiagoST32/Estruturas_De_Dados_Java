package com.dio.dioProjects_BootCamp.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> minhaFilaInteiros = new Fila<Integer>();

        minhaFilaInteiros.enqueue(1);
        minhaFilaInteiros.enqueue(2);
        minhaFilaInteiros.enqueue(3);
        minhaFilaInteiros.enqueue(4);

        System.out.println(minhaFilaInteiros);
        System.out.println(minhaFilaInteiros.first());

        Fila<String> minhaFilaStrings = new Fila<String>();
        minhaFilaStrings.enqueue("primeiro");
        minhaFilaStrings.enqueue("segundo");
        minhaFilaStrings.enqueue("terceiro");
        minhaFilaStrings.enqueue("quarto");
        minhaFilaStrings.enqueue("quinto");

        System.out.println(minhaFilaStrings);
        System.out.println(minhaFilaStrings.first());
    }
}
