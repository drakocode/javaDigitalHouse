package entidadesCurso;

import enums.TipoTurno;

import java.util.List;

public class Curso {
    private List<Materia> materia;
    private List<Turma> turma;
    private List<Matricula> matricula;
    private TipoTurno turno;


    //constructor


    public Curso(List<Materia> materia, List<Turma> turma, List<Matricula> matricula, TipoTurno turno) {
        this.materia = materia;
        this.turma = turma;
        this.matricula = matricula;
        this.turno = turno;
    }

    //setters n getters
    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

    public List<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Matricula> matricula) {
        this.matricula = matricula;
    }

    public TipoTurno getTurno() {
        return turno;
    }

    public void setTurno(TipoTurno turno) {
        this.turno = turno;
    }
}
