package entidadesPessoa;

public class Professor extends Pessoa{
    private int idProfessor;
    private int valorHora;

    //constructor


    public Professor(String nome, String cpf, String email, boolean sexo, int idProfessor, int valorHora) {
        super(nome, cpf, email, sexo);
        this.idProfessor = idProfessor;
        this.valorHora = valorHora;
    }

    //setters n getters
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
}
