package series;

public class SerieProxy implements ISerie{
    private Catalogo catalogo;

    public SerieProxy(Catalogo catalogo){
        this.setCatalogo(catalogo);
    }

    private void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void adicionarAoCatalogo(Serie serie){
        this.catalogo.adicionarSerie(serie);
    }

    @Override
    public String getSerie(String nomeSerie) throws SerieNaoHabilitadaException{
        if (!(this.catalogo.consultarViews(nomeSerie) < 5)){
            throw new SerieNaoHabilitadaException(nomeSerie + " excede o número de reproduções permitidas");

        }
        this.catalogo.atualizarViewsSerie(nomeSerie);
        return this.catalogo.consultarSerie(nomeSerie).getSerie(nomeSerie);
    }
}
