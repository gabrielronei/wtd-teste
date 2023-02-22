package br.com.gabriels.webplayground.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Form {

    private List<OutroForm> forms;


    public List<Entidade> getEntidades() {
        return forms.stream().map(OutroForm::converte).filter(Optional::isPresent).map(Optional::get).toList();
    }
}
