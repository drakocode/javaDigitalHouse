package series;

public class Player {
    public static void main(String[] args) {
        SerieProxy proxy = new SerieProxy(new Catalogo());

        //Criando algumas series pro catalogo
        proxy.adicionarAoCatalogo(new Serie("His Dark Materials"));
        proxy.adicionarAoCatalogo(new Serie("Supernatural"));
        proxy.adicionarAoCatalogo(new Serie("Brooklin 99"));

        try {
            System.out.println(proxy.getSerie("His Dark Materials"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }
        try {
            System.out.println(proxy.getSerie("Brooklin 99"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }
        try {
            System.out.println(proxy.getSerie("Brooklin 99"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }
        try {
            System.out.println(proxy.getSerie("Brooklin 99"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }
        try {
            System.out.println(proxy.getSerie("Brooklin 99"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }
        try {
            System.out.println(proxy.getSerie("Brooklin 99"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }
        try {
            System.out.println(proxy.getSerie("Brooklin 99"));
        } catch (SerieNaoHabilitadaException e){
            System.err.println(e);
        }


    }
}
