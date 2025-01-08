package com.dio.dioProjects_BootCamp.ArvoreBinaria;

import com.dio.dioProjects_BootCamp.ArvoreBinaria.Models.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.addNoBin(new Obj(13));
        minhaArvore.addNoBin(new Obj(10));
        minhaArvore.addNoBin(new Obj(25));
        minhaArvore.addNoBin(new Obj(2));
        minhaArvore.addNoBin(new Obj(12));
        minhaArvore.addNoBin(new Obj(20));
        minhaArvore.addNoBin(new Obj(31));
        minhaArvore.addNoBin(new Obj(29));
        minhaArvore.addNoBin(new Obj(32));


        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirPreOrdem();

        minhaArvore.removeNo(new Obj(32));
        minhaArvore.exibirInOrdem();
    }
}
