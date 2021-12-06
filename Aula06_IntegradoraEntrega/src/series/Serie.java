package series;

public class Serie implements ISerie{
    private final String nome;
    private int quantidadeViews = 0;

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getQuantidadeViews(){
        return this.quantidadeViews;
    }

    public void setQuantidadeViews(){
        this.quantidadeViews += 1;
    }

    @Override
    public String getSerie(String nomeSerie) {
        return "https://www.javaemserie.io/"+nomeSerie.replaceAll("\\s+","-")+"/player";
    }
}
