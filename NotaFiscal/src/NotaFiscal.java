import java.util.Date;

public class NotaFiscal {
    public static void main(String[] args) {}
    private int numero;
    private int serie;
    private int chaveAcesso;
    private boolean tipo;
    private String naturezaOperacao;
    private Date dataEmissao;
    private Date dataSaida;
    private boolean pagadorFrete;
    private String dadosAdicionais;

    //getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(int chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public NotaFiscal() {
    }

    public boolean isPagadorFrete() {
        return pagadorFrete;
    }

    public void setPagadorFrete(boolean pagadorFrete) {
        this.pagadorFrete = pagadorFrete;
    }

    public String getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(String dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }
//constructor


    public NotaFiscal(int numero, int serie, int chaveAcesso, boolean tipo, String naturezaOperacao, Date dataEmissao, Date dataSaida, boolean pagadorFrete, String dadosAdicionais) {
        this.numero = numero;
        this.serie = serie;
        this.chaveAcesso = chaveAcesso;
        this.tipo = tipo;
        this.naturezaOperacao = naturezaOperacao;
        this.dataEmissao = dataEmissao;
        this.dataSaida = dataSaida;
        this.pagadorFrete = pagadorFrete;
        this.dadosAdicionais = dadosAdicionais;
    }
}
