package com.dio.dioProjects_BootCamp.EqualsHashCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Carro> carroSet = new HashSet<>();
        Set<Carro> treeSetCarro = new TreeSet<>();

        carroSet.add(new Carro("Bmw"));
        carroSet.add(new Carro("Bugatti"));
        carroSet.add(new Carro("Koenigsegg"));
        System.out.println(carroSet);

        treeSetCarro.add(new Carro("Bmw"));
        treeSetCarro.add(new Carro("Abarth"));
        treeSetCarro.add(new Carro("Koenigsegg"));
        System.out.println(treeSetCarro);
    }
}
