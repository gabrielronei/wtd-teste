package br.com.gabriels.webplayground.manyToManySetVsList;

import org.hibernate.annotations.Formula;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.*;

@Entity
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @Length(max = 255)
    private String metaTitle;

    @Formula("select 100")
    private int conta;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "student_curso", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private Set<Course> cursos = new HashSet<>();

    @Deprecated
    public Student() {
    }

    public Student(String nome, String metaTitle, int conta, Set<Course> cursos) {
        this.nome = nome;
        this.metaTitle = metaTitle;
        this.conta = conta;
        this.cursos = cursos;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Course> getLikedCourses() {
        return cursos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Course> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Course> cursos) {
        this.cursos = cursos;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void update(Student student) {
        this.cursos = student.getCursos();
    }
}
