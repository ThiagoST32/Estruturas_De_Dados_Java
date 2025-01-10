package com.dio.dioProjects_BootCamp.Set;

import java.util.*;

public class SetNotas {
    public static void main(String[] args) {
        Set<Double> minhasNotas = new HashSet<>(Arrays.asList(4d, 5d, 6d, 7d, 8d, 9d, 10d, 11d, 12d, 13d, 14d, 15d));
        System.out.println(minhasNotas.toString());

        System.out.println("Confira se a nota 5 está no conjunto -> " + minhasNotas.contains(5d));
        System.out.println("Menor nota -> " + Collections.min(minhasNotas));
        System.out.println("Maior nota -> " + Collections.max(minhasNotas));

        Iterator<Double> iterator = minhasNotas.iterator();
        double soma = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma valores -> " + soma );

        System.out.println("Media nota -> " + (soma / minhasNotas.size()));

        minhasNotas.remove(7d);
        System.out.println("Remova nota 7 -> " + minhasNotas.toString());

        Iterator<Double> iterator1 = minhasNotas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 9){
                iterator1.remove();
            }
        }
            System.out.println("Remova notas menores que 9 -> " + minhasNotas);
        Set<Double> minhasNotas2 = new TreeSet<>(minhasNotas);
        System.out.println(minhasNotas2);
        minhasNotas2.clear();
        System.out.println(minhasNotas2);

        System.out.println("Está vazia?? -> " + minhasNotas.isEmpty());

    }
}
