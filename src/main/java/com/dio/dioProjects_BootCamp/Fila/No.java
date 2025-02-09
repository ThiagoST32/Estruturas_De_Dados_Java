package com.dio.dioProjects_BootCamp.Fila;

public class No<T> {

    private T object;
    private No refNo;

    public No(T object) {
        this.object = object;
        this.refNo = null;
    }

    public No() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
