public class CheckPeso extends Checker {
    @Override
    public void verify(Produto produto){
        if(produto.getPeso()>=1200||produto.getPeso()<=1300){
            System.out.println("peso foi");
        }else {
            System.out.println("peso n foi");
        }
    }






}
