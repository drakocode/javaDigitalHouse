import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        List<Contatos> contatos=new ArrayList<>();

        Contatos contato0=new Contatos("Erik","erik@email.com","123132132");
        Contatos contato1=new Contatos("Adriano","adriano@email.com","123132132");
        Contatos contato2=new Contatos("Henrique","henrique@email.com","123132132");
        Contatos contato3=new Contatos("Ronilson","ronilson@email.com","123132132");
        Contatos contato4=new Contatos("Cleverson","cleverson@email.com","123132132");
        Contatos contato5=new Contatos("Ana","ana@email.com","123132132");
        Contatos contato6=new Contatos("João","joao@email.com","123132132");
        Contatos contato7=new Contatos("Leticia","leticia@email.com","123132132");
        Contatos contato8=new Contatos("Roberto","roberto@email.com","123132132");
        Contatos contato9=new Contatos("Silvia","silvia@email.com","123132132");
        Contatos contato10=new Contatos("Matheus","matheus@email.com","123132132");
        Contatos contato11=new Contatos("Vitor","vitor@email.com","123132132");
        Contatos contato12=new Contatos("Tais","tais@email.com","123132132");

        contatos.add(contato0);
        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);
        contatos.add(contato6);
        contatos.add(contato7);
        contatos.add(contato8);
        contatos.add(contato9);
        contatos.add(contato10);
        contatos.add(contato11);
        contatos.add(contato12);


        //saving file
        FileOutputStream fo=null;

        try{
            fo=new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);
            dos.writeObject(contatos);
        }catch (FileNotFoundException e){
            System.out.println("ERROR: "+e.getMessage());

        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());

        }

        //recuperacao do arquivo serializado
        List<Contatos> contatos2=null;
        FileInputStream fi=null;

        try{
            fi=new FileInputStream("OutputFile.txt");
            ObjectInputStream ois=new ObjectInputStream(fi);
            contatos2=(ArrayList) ois.readObject();//<=casting
        }catch (FileNotFoundException e){
            System.out.println("ERROR: "+e.getMessage());

        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());

        }

        //imprimir
        for (Contatos c:contatos2) System.out.println(
                c.getNome()
                +" - "
                +c.getEmail()
                +" - "
                +c.getTelefone()

        );

    }


}
