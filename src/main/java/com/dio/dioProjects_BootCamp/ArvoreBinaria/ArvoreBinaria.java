package com.dio.dioProjects_BootCamp.ArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void removeNo(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                System.out.println("Conteudo não encontrado!!! Bloco try");
            }
            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(this.raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(this.raiz.getNoDir());
                    this.raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoDir(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for (temp = atual, filho = atual.getNoEsq();
                     filho.getNoDir() != null;
                     temp = filho, filho = filho.getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }
        } catch (NullPointerException exception) {
            System.out.println("Erro!! " + exception.getMessage() + " Bloco catch");
        }
    }

    public void exibirInOrdem() {
        System.out.println("\n Exibindo em Ordem!!");
        exibirInOrdem(this.raiz);
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo em Pós Ordem!!");
        exibirPosOrdem(this.raiz);
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo em Pré Ordem!!");
        exibirPreOrdem(this.raiz);
    }

    public void addNoBin(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = addNoBin(this.raiz, novoNo);
    }

    private BinNo<T> addNoBin(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(addNoBin(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(addNoBin(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
}
