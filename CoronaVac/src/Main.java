import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        int year=2021;
        int month=0;
        int day=22;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        Date date=calendar.getTime();
        Pessoa cleberson =new Pessoa("Cleberson","Antunes","887755","CoronaVac",date);
        Iregistro registro=new RegistroVacinaProxy();
        registro.registrar(cleberson.dados());

        System.out.println();






    }






}
