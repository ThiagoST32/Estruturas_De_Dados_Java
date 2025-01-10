package com.dio.dioProjects_BootCamp.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> carros = new HashMap<>() {{
            put("M3", 300d);
            put("M2", 200d);
            put("M1", 100d);
        }};
        System.out.println("Dicionario de carros -> " + carros);
        System.out.println(carros);

        System.out.println("Substitua M2 para 250 -> ");
        carros.put("M2", 250d);
        System.out.println(carros.get("M2"));

        System.out.println("Verifique se M3 está no dicionario -> " + carros.containsKey("M3"));
        System.out.println("Exiba M1 -> " + carros.get("M1"));
        System.out.println("Exiba os modelos -> ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os valores -> ");
        Collection<Double> valores = carros.values();
        System.out.println(valores);

        System.out.println("Exiba o maior valor ->");
        Double maiorValor = Collections.max(carros.values());
        System.out.println(maiorValor);

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisCaro = new String();
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maiorValor)) {
                modeloMaisCaro = entry.getKey();
            }
        }
        System.out.println("Modelo mais caro -> " + modeloMaisCaro);

        Double menorValor = Collections.min(carros.values());
        Set<Map.Entry<String, Double>> entries2 = carros.entrySet();
        String modeloMaisBarato = new String();
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(menorValor)) {
                modeloMaisBarato = entry.getKey();
            }
        }
        System.out.println("Modelo mais barato -> " + modeloMaisBarato);
        Iterator<Double> iterator = carros.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma carros -> " + soma);
        System.out.println("Media total carros -> " + soma / carros.size());

//        System.out.println("Remova valores menor de 300");
//        Iterator<Double> iterator1 = carros.values().iterator();
//        double valor = 300d;
//        while (iterator1.hasNext()) {
//            if (iterator.next() < valor) {
//                iterator1.remove();
//            }
//        }
//        System.out.println(carros);

        Map<String, Double> carros2 = new LinkedHashMap<>() {{
            put("M3", 300d);
            put("M2", 200d);
            put("M1", 100d);
        }};

        System.out.println(carros2.toString());

        Map<String, Double> carros3 = new TreeMap<>() {{
            put("M3", 300d);
            put("M2", 200d);
            put("M1", 100d);
        }};

        System.out.println(carros3.toString());

        System.out.println("Limpar carros");
        carros3.clear();

        System.out.println("Está vazio? -> " + carros3.isEmpty() );
    }
}
