import DTOPC.PC;
import Flyweight.PCFactory;

public class Main {
    public static void main(String[] args) {
    PCFactory computador =new PCFactory();

    PC win1=computador.getPECE(16,128);
    PC mac1=computador.getPECE(8,500);
    PC win2=computador.getPECE(2,256);
    PC mac2=computador.getPECE(64,5222);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(win1.toString());
        System.out.println(win2.toString());

    }











}
