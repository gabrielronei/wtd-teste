package br.com.gabriels.webplayground.dynamicInput;

public class NewAcademicEducationForm {

    private String nome;

    private AcademicEducationType academicEducationType;

    private boolean isCompleted;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AcademicEducationType getAcademicEducationType() {
        return academicEducationType;
    }

    public void setAcademicEducationType(AcademicEducationType academicEducationType) {
        this.academicEducationType = academicEducationType;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "NewAcademicEducationForm{" +
                "nome='" + nome + '\'' +
                ", academicEducationType=" + academicEducationType +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
