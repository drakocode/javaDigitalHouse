public class Produto {
    private int lote;
    private int peso;
    private String embalagem;

    public Produto(int lote, int peso, String embalagem) {
        this.lote = lote;
        this.peso = peso;
        this.embalagem = embalagem;
    }


    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
}
