package com.dio.dioProjects_BootCamp.Stream;

import com.dio.dioProjects_BootCamp.Stream.Domain.Contato;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- \tSim\t ---");
        Map<Integer, Contato> contatos = new HashMap<>() {{
            put(1, new Contato("Jao", 1234));
            put(2, new Contato("Vitin", 5678));
            put(3, new Contato("Pedrin", 9012));
            put(4, new Contato("Thigas", 3456));
        }};

        System.out.println(contatos);
        for (Map.Entry<Integer, Contato> entries : contatos.entrySet()) {
            System.out.println(entries.getKey() + " - " + entries.getValue().getNumero());
        }

        System.out.println("--- \nOrdem Inserção\n ---");
        Map<Integer, Contato> contatos2 = new LinkedHashMap<>() {{
            put(1, new Contato("Jao", 1234));
            put(2, new Contato("Vitin", 5678));
            put(3, new Contato("Pedrin", 9012));
            put(4, new Contato("Thigas", 3456));
        }};
        System.out.println(contatos2);

        System.out.println("Ordem por numero");
        Set<Map.Entry<Integer, Contato>> entries = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });
        entries.addAll(contatos2.entrySet());
        System.out.println("ENTRIES -> " + entries);

        //Funciton
        Set<Map.Entry<Integer, Contato>> function = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
        function.addAll(contatos2.entrySet());
        System.out.println("FUNCTION -> " + function);

        //Lambda
        Set<Map.Entry<Integer, Contato>> lambda = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        lambda.addAll(contatos2.entrySet());
        System.out.println("LAMBDA -> " + lambda);
    }
}
