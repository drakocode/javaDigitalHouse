package meusistema.cadastros;

import meusistema.Cadastro;

import java.util.List;

public class PessoaPrincipal implements Cadastro {
    private String nomeCompleto;
    private List<Telefone> telefones;
    private Turno turno;



    // constructor


    public PessoaPrincipal(String nomeCompleto, List<Telefone> telefones, Turno turno) {
        this.nomeCompleto = nomeCompleto;
        this.telefones = telefones;
        this.turno = turno;
    }

    public PessoaPrincipal() {
    }


    // setters getters
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getNome() {
        return nomeCompleto;
    }

    public void setNome(String nome) {
        this.nomeCompleto = nome;
    }


    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public void cadastrar() {

    }
}
