public class Imposto {
    private float aliquota;
    private float nome;



    //getters and setters
    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public float getNome() {
        return nome;
    }

    public void setNome(float nome) {
        this.nome = nome;
    }

    //constructor

    public Imposto(float aliquota, float nome) {
        this.aliquota = aliquota;
        this.nome = nome;
    }
}
