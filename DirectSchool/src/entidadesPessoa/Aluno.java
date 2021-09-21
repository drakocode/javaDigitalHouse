package entidadesPessoa;

public class Aluno extends Pessoa{
    private  int idAluno;

    //constructor


    public Aluno(int idAluno) {
        this.idAluno = idAluno;
    }

    //setters n getters
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
}
