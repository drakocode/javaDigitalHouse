public class Estagiario extends Vendedor{

    public Estagiario(String nome){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }



    public String getNomeCategoria(int pontosVendedor){
        if(pontosVendedor <50){
            return "estagiario novato";
        }
        else{
            return "estagiario experiente";
        }
    }
    @Override
    public String mostrarCategoria(){
        int pontosDoVendedor = calcularPontos();
        if(pontosDoVendedor <50){
            return this.nome + " tem um total de " + pontosDoVendedor + " pontos e categoriza como estagiario novato";
        }
        else{
            return this.nome + " tem um total de " + pontosDoVendedor + " pontos e categoriza como estagiario experiente";
        }
    }



    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }
}
