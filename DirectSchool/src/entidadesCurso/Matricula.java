package entidadesCurso;

import java.util.Date;

public class Matricula {
    private int matricula;
    private Date dataMatricula;

    //constructor


    public Matricula(int matricula, Date dataMatricula) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    //setters n getters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
