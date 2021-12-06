import org.apache.log4j.Logger;

public class Lion {

    public static Logger logger=Logger.getLogger(Lion.class);

    private String nome;
    private int idade;
    private boolean alpha;

    public Lion(String nome, int idade, boolean alpha) {
        this.nome = nome;
        this.idade = idade;
        this.alpha = alpha;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAlpha() {
        return alpha;
    }

    public void setAlpha(boolean alpha) {
        this.alpha = alpha;
    }

    public void run(){
        logger.info("Lion "+nome+" running");
    }

    public void isMaior10() throws Exception{
        if (idade>=10&& isAlpha()){
            logger.info("Lion "+nome+" tem 10 anos ou mais e é alfa");
        }else if (idade>=10&& !isAlpha()){
            logger.info("Lion "+nome+" tem 10 anos ou mais e é beta");
        }else if (idade<10&& idade>0){
            logger.info("Lion "+nome+" n tem idade pra correr");

        }else{
            logger.error("Lion "+nome+" tem idade negativa");
            throw new Exception();
        }


    }



}
