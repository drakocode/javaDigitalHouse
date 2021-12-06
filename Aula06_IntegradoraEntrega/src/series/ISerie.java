package series;

public interface ISerie {

    public abstract String getSerie(String nomeSerie) throws SerieNaoHabilitadaException;
}
