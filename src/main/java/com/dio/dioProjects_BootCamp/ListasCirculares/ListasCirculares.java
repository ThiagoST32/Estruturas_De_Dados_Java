package com.dio.dioProjects_BootCamp.ListasCirculares;

public class ListasCirculares<T> {
    private No<T> cabeça;
    private No<T> cauda;
    private int tamanhoLista;

    public ListasCirculares() {
        this.cauda = null;
        this.cabeça = null;
        this.tamanhoLista = 0;
    }

    public void add(T elemento){
        No<T> novoNo =new No<>(elemento);
        if (this.tamanhoLista == 0){
            this.cabeça = novoNo;
            this.cauda = this.cabeça;
            this.cauda.setNoProximo(this.cauda);
        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeça.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;

    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indicie é maior q o tamanho da lista!!");
        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeça.setNoProximo(this.cauda);
        } else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index-1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vázia!!!");
        if (index == 0) {
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < size(); i++) {
            strRetorno += "{No[Conteudo: " + noAuxiliar.getConteudo() + "}]" + " ----> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() != 0 ? "(Retorna Inicio)" : "[]";
        return strRetorno;
    }
}
