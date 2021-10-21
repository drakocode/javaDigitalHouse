package meusistema.cadastros;

public class CadastroProfessor extends PessoaPrincipal{
    private double valorHora;
    private Formacao formacao;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
}
