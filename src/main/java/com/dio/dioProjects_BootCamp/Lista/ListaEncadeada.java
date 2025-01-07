package com.dio.dioProjects_BootCamp.Lista;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty() {
        return this.referenciaEntrada == null ? true : false;
    }

    public T removeNo(int index) {
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            this.referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = this.referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            this.referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = this.referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public int size() {
        int tamanhoLista = 0;
        No referenciaAux = this.referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void validaIndice(int indice) {
        int ultimoIndice = size() - 1;
        if (indice >= this.size()) {
            throw new IndexOutOfBoundsException("Não existe conteudo no indice representado : " + indice + " desta lista!\n"
            + "A lista vai apenas até o indice: " + ultimoIndice);
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{" + "Conteudo = " + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
