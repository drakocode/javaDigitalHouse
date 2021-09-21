package entidadesCurso;

import entidadesPessoa.Professor;

public class Materia {
    private String materiaCurso;
    private int valorMateria;
    private Professor professor;




    //constructor
    public Materia(String materiaCurso, int valorMateria, Professor professor) {
        this.materiaCurso = materiaCurso;
        this.valorMateria = valorMateria;
        this.professor = professor;
    }

    //setters n getters
    public String getMateriaCurso() {
        return materiaCurso;
    }

    public void setMateriaCurso(String materiaCurso) {
        this.materiaCurso = materiaCurso;
    }

    public int getValorMateria() {
        return valorMateria;
    }

    public void setValorMateria(int valorMateria) {
        this.valorMateria = valorMateria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
