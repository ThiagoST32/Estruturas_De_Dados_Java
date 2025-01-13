package com.dio.dioProjects_BootCamp.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStream {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("4", "2", "3", "1", "0", "8", "2", "4", "5", "3", "9", "7");

        List<Integer> randomNumbersInt =
                randomNumbers.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        System.out.println("Imprima todos os elementos");


        randomNumbers.stream()
                .forEach(System.out::print);

        System.out.println("\nPegue os primeiros 5 numeros e coloque dentro de um SET");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::print);

        System.out.println("\nTransforme essa lista de String em uma lista de inteiros!");
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

        System.out.println("\nMostre a média dos numeros");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os 3 primeiros elementos da lista!");
        List<Integer> randomNumbersIntLess = randomNumbersInt.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(randomNumbersIntLess);

        System.out.println("\n Remova os valores impares");
        randomNumbersInt.removeIf(i -> i % 2 != 0);
        System.out.println(randomNumbersInt);


    }
}
