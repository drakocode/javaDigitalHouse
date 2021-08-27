public class Veiculo {
    private int antt;
    private String placa;
    private String uf;



    //getters and setters
    public int getAntt() {
        return antt;
    }

    public void setAntt(int antt) {
        this.antt = antt;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    //constructor

    public Veiculo(int antt, String placa, String uf) {
        this.antt = antt;
        this.placa = placa;
        this.uf = uf;
    }
}
