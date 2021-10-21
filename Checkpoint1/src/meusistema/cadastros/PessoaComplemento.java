package meusistema.cadastros;

public class PessoaComplemento extends PessoaPrincipal{
    private String cpf;
    private boolean sexo;
    private Endereco endereco;
    private String email;




    public PessoaComplemento(String cpf, boolean sexo, Endereco endereco, String email) {
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.email = email;
    }


    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
