package br.com.gabriels.webplayground.polymorfism;

public class ContaCorrente extends Conta {

    public void getX() {
        System.out.println("xyz");
    }


    @Override
    public String toString() {
        return "ContaCorrente{}";
    }
}
