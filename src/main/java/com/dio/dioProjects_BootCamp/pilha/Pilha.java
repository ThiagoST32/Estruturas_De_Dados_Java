package com.dio.dioProjects_BootCamp.pilha;

public class Pilha {
    private No refNoEntradaPilha;


    public void Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty() {
        return this.refNoEntradaPilha == null ? true : false;
    }

    public No top() {
        return this.refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = novoNo;
        this.refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = this.refNoEntradaPilha;
            this.refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";

        No noAuxiliar = this.refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "------------\n";;
        return stringRetorno;

    }
}
