public class Usuario {
    private String nome;
    private boolean tipoConta;

    public Usuario(String nome, boolean tipoConta) {
        this.nome = nome;
        this.tipoConta = tipoConta;
    }

    public Object[] dados() {
        Object[] informacao;

        informacao = new Object[2];
        informacao[0] = nome;
        informacao[1] = tipoConta;
        return  informacao;


    }





}
