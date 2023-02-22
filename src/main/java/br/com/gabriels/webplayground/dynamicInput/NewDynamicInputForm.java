package br.com.gabriels.webplayground.dynamicInput;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

public class NewDynamicInputForm {


    @NotBlank
    private String nome;
    private List<NewAcademicEducationForm> newAcademicEducationForms = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public List<NewAcademicEducationForm> getNewAcademicEducationForms() {
        return newAcademicEducationForms;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNewAcademicEducationForms(List<NewAcademicEducationForm> newAcademicEducationForms) {
        this.newAcademicEducationForms = newAcademicEducationForms;
    }

    @Override
    public String toString() {
        return "NewDynamicInputForm{" +
                "nome='" + nome + '\'' +
                ", newAcademicEducationForms=" + newAcademicEducationForms +
                '}';
    }
}
