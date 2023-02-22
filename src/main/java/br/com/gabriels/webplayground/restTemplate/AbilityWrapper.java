package br.com.gabriels.webplayground.restTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityWrapper {

    private Ability ability;

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "AbilityWrapper{" +
                "ability=" + ability +
                '}';
    }
}
