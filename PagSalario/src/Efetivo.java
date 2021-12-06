public class Efetivo extends Funcionario{
    //efetivo e uma subclasse de funcionario extendido

    private double salarioBase;
    private double desconto;
    private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double desconto, double bonificacoes){
        super(nome, sobrenome, numeroConta);
        this.salarioBase=salarioBase;
        this.desconto=desconto;
        this.bonificacoes=bonificacoes;

    }

    @Override
    public double calcularSalario(){
        return salarioBase+bonificacoes-desconto;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("recibo impresso");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("foi depositado a quantia "+quantia);
    }
}

