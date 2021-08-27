public class Destinatario {
    private String nome;
    private int cnpj;
    private int ie;




    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getIe() {
        return ie;
    }

    public void setIe(int ie) {
        this.ie = ie;
    }


    //constructor
    public Destinatario(String nome, int cnpj, int ie) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.ie = ie;
    }
}
