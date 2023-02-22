package br.com.gabriels.webplayground.generico;

public class Generator<E> {

    public E build() {
        return (E) new Uma();
    }
}
