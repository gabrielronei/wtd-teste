package br.com.gabriels.webplayground.testaListVsSet;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String telefone;

    @Deprecated
    public Telefone() {
    }

    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
