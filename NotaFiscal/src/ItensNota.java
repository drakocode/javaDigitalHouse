public class ItensNota {
    private int quantidade;
    private float valorTotal;
    private float valorIcms;



    //getters and setters

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(float valorIcms) {
        this.valorIcms = valorIcms;
    }


    //constructor


    public ItensNota(int quantidade, float valorTotal, float valorIcms) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.valorIcms = valorIcms;
    }
}
