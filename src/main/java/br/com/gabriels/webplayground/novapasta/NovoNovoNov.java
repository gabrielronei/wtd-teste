package br.com.gabriels.webplayground.novapasta;

import java.math.BigDecimal;

public class NovoNovoNov {

    private String titulo;
    private boolean ehNovo;
    private BigDecimal preco;

    public NovoNovoNov(String titulo, boolean ehNovo, BigDecimal preco) {
        this.titulo = titulo;
        this.ehNovo = ehNovo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEhNovo() {
        return ehNovo;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
