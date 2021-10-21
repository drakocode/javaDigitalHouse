package meusistema;
import java.util.List;

import meusistema.cadastros.CadastroAluno;
import meusistema.cadastros.CadastroProfessor;
import meusistema.cadastros.Turno;

public class Turma {
    private int numeroSala;
    private String nomeSala;
    private Turno turno;
    private List<CadastroAluno> alunos;
    private List<CadastroProfessor> professores;


    public Turma(int numeroSala, String nomeSala, Turno turno, List<CadastroAluno> alunos) {
        this.numeroSala = numeroSala;
        this.nomeSala = nomeSala;
        this.turno = turno;
        this.alunos = alunos;
    }

    //setters getters
    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<CadastroAluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<CadastroAluno> alunos) {
        this.alunos = alunos;
    }

    public List<CadastroProfessor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<CadastroProfessor> professores) {
        this.professores = professores;
    }
}
