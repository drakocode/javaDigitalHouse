package entidadesCurso;

import entidadesPessoa.Aluno;
import entidadesPessoa.Professor;

import java.util.List;

public class Turma {
    private int sala;
    private List<Aluno> alunos;
    private List<Professor> professor;

    //constructor


    public Turma(int sala, List<Aluno> alunos, List<Professor> professor) {
        this.sala = sala;
        this.alunos = alunos;
        this.professor = professor;
    }

    //setters n getters
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }
}
