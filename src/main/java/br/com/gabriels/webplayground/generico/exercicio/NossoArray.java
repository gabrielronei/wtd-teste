package br.com.gabriels.webplayground.generico.exercicio;

import java.util.Objects;

public class NossoArray implements Comparable {

    private int valor;


    public NossoArray(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean compareTo(Object o) {
        return equals(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NossoArray that = (NossoArray) o;
        return valor == that.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}

interface Comparable<T> {
    boolean compareTo(T o);
}