package br.com.gabriels.webplayground.testeJackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestandoJacksonProperty {

    @JsonProperty("bab")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestandoJacksonProperty{" +
                "name='" + name + '\'' +
                '}';
    }
}
