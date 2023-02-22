package br.com.gabriels.webplayground.generico.exercicio;

import java.util.LinkedList;
import java.util.List;

//Exercício:	Escreva	um	método	genérico	que	conte	o	número	de	elementos
//        em	um	array	T[]	que	sejam	maiores	que	um	elemento	elem
public class Main {
    public static void main(String[] args) {
        NossoArray[] x = new NossoArray[]{new NossoArray(1), new NossoArray(2), new NossoArray(3), new NossoArray(4)};

        int i = ContadorDeArrayGenerico.contaArray(x, new NossoArray(1));

        System.out.println(i);

        List myIntList = new LinkedList(); // 1
        myIntList.add(new Integer(0)); // 2
        Integer z = (Integer) myIntList.iterator().next();
    }
}
