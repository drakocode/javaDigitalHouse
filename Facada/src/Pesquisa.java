public class Pesquisa {
    private ApiPesquisa apiPesquisa;

    public Pesquisa(){
        apiPesquisa = new ApiPesquisa(BuscaVoo buscaVoo, BuscaHotel buscaHotel){
        this.buscaVoo = buscaVoo;
        this.buscaHotel = buscaHotel;
        };
    }
}
