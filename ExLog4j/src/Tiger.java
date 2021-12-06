import org.apache.log4j.Logger;

public class Tiger {
    public static Logger logger=Logger.getLogger(Lion.class);

    private String nome;
    private int idade;

    public Tiger(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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




    public void run(){
        logger.info("Tiger "+nome+" running");
    }

    public void isMaior10() throws Exception{
        if (idade>=10){
            logger.info("Tiger "+nome+" tem 10 anos");
        }else if (idade<10&& idade>0){
            logger.info("Tiger "+nome+" n tem idade pra correr");
        }else{
            logger.error("Tiger "+nome+" tem idade negativa");
            throw new Exception();
        }


    }

}
