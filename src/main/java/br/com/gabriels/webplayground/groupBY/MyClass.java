package br.com.gabriels.webplayground.groupBY;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class MyClass {
    public static void main(String args[]) {
        List<Produto> produtos = List.of(new Produto("eai", Produto.Tamanho.PEQUENO), new Produto("eaieaiaei", Produto.Tamanho.MEDIO));
        Map<Produto.Tamanho, List<Produto>> produtosPorTamanho = Arrays.stream(Produto.Tamanho.values())
                .collect(groupingBy(tamanho -> tamanho, flatMapping(tamanho -> produtos.stream().filter(produto -> produto.getTamanhos().contains(tamanho)), toList())));


//        Map<Produto.Tamanho, List<Produto>> produtinhosPorTamanho = produtos.stream().
//                flatMap(produto -> produto.getTamanhos().stream())
//                .collect(groupingBy(Function.identity(), flatMapping(Produto::contains), toList()));
    }


    static class Produto {

        private String descricao;

        private List<Tamanho> tamanho;

        public Produto(String descricao, Tamanho tamanho) {
            this.descricao = descricao;
            this.tamanho = List.of(tamanho, Tamanho.GRANDE);
        }

        public String getDescricao() {
            return descricao;
        }

        public List<Tamanho> getTamanhos() {
            return tamanho;
        }

        public boolean contains(Tamanho tamanho) {
            return this.tamanho.contains(tamanho);
        }

        enum Tamanho {
            PEQUENO, MEDIO, GRANDE;
        }
    }
}
