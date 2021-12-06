public class Check {
    Checker initial;

    public Check(){
        this.initial=new CheckEmbalagem();
        Checker lote = new CheckLote();
        Checker peso=new CheckPeso();

        initial.setNext(lote);
        lote.setNext(peso);


    }
    public void verify(Produto produto){
        initial.verify(produto);
    }
}
