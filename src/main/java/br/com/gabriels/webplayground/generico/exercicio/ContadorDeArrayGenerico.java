package br.com.gabriels.webplayground.generico.exercicio;

public class ContadorDeArrayGenerico {

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> int contaArray(T[] elementos, T elem) {
        int count = 0;
        for (T element : elementos) {
            if (!elem.compareTo(element)) {
                count ++;
            }
        }
        return count;
    }
}


