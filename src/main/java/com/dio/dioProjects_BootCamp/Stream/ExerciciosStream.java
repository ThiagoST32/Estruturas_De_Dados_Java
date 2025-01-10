package com.dio.dioProjects_BootCamp.Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStream {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("4","2","3","1","0","8","2","4","5","3","9","7");

        System.out.println("Imprima todos os elementos");
        randomNumbers.stream()
                .forEach(System.out::print);

        System.out.println("Pegue os primeiros 5 numeros e coloque dentro de um SET");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::print);

        System.out.println("Transforme essa lista de String em uma lista de inteiros!");
        List<Integer> integerList = randomNumbers.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(integerList);

        System.out.println("Pegue numero maiores que 2 e adicione a uma lista de inteiros");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::print);
    }
}
