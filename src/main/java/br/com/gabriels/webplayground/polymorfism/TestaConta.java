package br.com.gabriels.webplayground.polymorfism;

import java.util.List;

public class TestaConta {

    public static void main(String[] args) {

        List<Conta> contas = List.of(new ContaCorrente(), new Conta());

        Conta contaCorrente = new ContaCorrente();
        ((ContaCorrente) contaCorrente).getX();


//        for (Conta conta :
//                contas) {
//            if (conta instanceof ContaPoupanca contaPoupanca) {
//                System.out.println(contaPoupanca);
//            } else {
//            Conta contaCorrente = new ContaCorrente();
//            System.out.println("Conta Corrente");
//            }
//        }
    }
}
