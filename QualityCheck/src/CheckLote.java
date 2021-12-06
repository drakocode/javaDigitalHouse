public class CheckLote extends Checker {
    @Override
    public void verify(Produto produto){
        if(produto.getLote()>=1000 || produto.getLote()<=2000){
            System.out.println("lote foi");
        }else {
            System.out.println("lote n foi");
        }
    }





}
