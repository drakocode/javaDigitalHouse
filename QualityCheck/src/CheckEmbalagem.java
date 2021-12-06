public class CheckEmbalagem extends Checker {
    @Override
    public void verify(Produto produto){
        if(produto.getEmbalagem().equalsIgnoreCase("saudavel")||produto.getEmbalagem().equalsIgnoreCase("nao saudavel")){
            System.out.println("embalagem foi");
        }else {
            System.out.println("embalagem n foi");
        }
    }





}
