package br.com.gabriels.webplayground.restTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonReponse {

    private List<AbilityWrapper> abilities;

    private List<Form> forms;

    public List<AbilityWrapper> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilityWrapper> abilities) {
        this.abilities = abilities;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    @Override
    public String toString() {
        return "PokemonReponse{" +
                "abilities=" + abilities +
                ", forms=" + forms +
                '}';
    }
}

