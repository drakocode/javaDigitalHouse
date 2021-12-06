public class Mercado {

    public static void main(String[] args){
        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("54286565656465456945", "Itau");
        Produto produto = new Produto("Abacaxi em conserva", "Caixa");
        System.out.println("O desconto total é: " + facade.desconto(cartao,produto,6));
    }
}
