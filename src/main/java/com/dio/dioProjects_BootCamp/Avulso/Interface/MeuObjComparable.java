package com.dio.dioProjects_BootCamp.Avulso.Interface;

public class MeuObjComparable implements Comparable<MeuObjComparable> {
    Integer meuValor;
    String minhaString;

    public MeuObjComparable(String minhaString, Integer meuValor) {
        this.minhaString = minhaString;
        this.meuValor = meuValor;
    }

    @Override
    public int compareTo(MeuObjComparable obj) {
        return this.meuValor > obj.meuValor ?
                1 : this.meuValor < obj.meuValor ?
                    -1 :
                        0;
    }
}
