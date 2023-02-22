package br.com.gabriels.webplayground.hibernate;

import com.fasterxml.jackson.annotation.JsonCreator;

public class NovaRequisicaoForm {

    private int umAtributo;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public NovaRequisicaoForm(int umAtributo) {
        this.umAtributo = umAtributo;
    }

    @Override
    public String toString() {
        return "NovaRequisicaoForm{" +
                "umAtributo='" + umAtributo + '\'' +
                '}';
    }
}
