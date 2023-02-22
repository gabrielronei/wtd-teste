package br.com.gabriels.webplayground.form;

import javax.validation.constraints.NotBlank;

public class TesteForm {

    @NotBlank
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
