import org.apache.log4j.Logger;

public class Test {

    private static Logger logger= Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Lion lion=new Lion("Mufasa",11,true);
        Lion lion0=new Lion("Simbad",5,true);
        Lion lion1=new Lion("Dabmis",-55,false);

        lion.run();
        lion0.run();
        lion1.run();

        try{
            lion.isMaior10();
        }catch (Exception exception){
            logger.error("a idade do leao "+lion.getNome()+" ta incorreta", exception);
        }



        try{
            lion0.isMaior10();
        }catch (Exception exception){
            logger.error("a idade do leao "+lion.getNome()+" ta incorreta", exception);
        }
        try{
            lion1.isMaior10();
        }catch (Exception exception){
            logger.error("a idade do leao "+lion.getNome()+" ta incorreta", exception);
        }

        Tiger tiger=new Tiger("Diego",11);
        Tiger tiger0=new Tiger("Ogeid",8);
        Tiger tiger1=new Tiger("Tigro",-88);
        tiger.run();
        tiger0.run();
        tiger1.run();

        try{
            tiger.isMaior10();
        }catch (Exception e){
            logger.error("a idade do tigre "+tiger.getNome()+" ta incorreta", e);
        }
        try{
            tiger0.isMaior10();
        }catch (Exception e){
            logger.error("a idade do tigre "+tiger0.getNome()+" ta incorreta", e);
        }
        try{
            tiger1.isMaior10();
        }catch (Exception e){
            logger.error("a idade do tigre "+tiger1.getNome()+" ta incorreta", e);
        }

    }
}