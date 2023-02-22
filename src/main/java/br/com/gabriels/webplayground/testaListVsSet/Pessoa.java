package br.com.gabriels.webplayground.testaListVsSet;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @CPF
    @NotBlank
    private String cpf;

    @JoinColumn(name = "pessoa_id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<>();

    @Deprecated
    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, List<Telefone> telefones) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefones = telefones;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
