package series;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Serie> series;

    public Catalogo(){
        this.series = new ArrayList<>();
    }

    public void adicionarSerie(Serie serie){
        this.series.add(serie);
    }

    public void atualizarViewsSerie(String nome){
        for(int i=0; i < this.series.size(); i++){
            if (series.get(i).getNome().equalsIgnoreCase(nome)){
                series.get(i).setQuantidadeViews();
            }
        }
    }

    public Serie consultarSerie(String nome){
        for(int i=0; i < this.series.size(); i++){
            if (series.get(i).getNome().equalsIgnoreCase(nome)){
                return series.get(i);
            }
        }
        return null;
    }

    public int consultarViews(String nome){
        for(int i=0; i < this.series.size(); i++){
            if (series.get(i).getNome().equalsIgnoreCase(nome)){
                return series.get(i).getQuantidadeViews();
            }
        }
        return 0;
    }

}
