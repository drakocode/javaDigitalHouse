import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Dog> dogs=new ArrayList<>();

        Dog c0= new Dog("BatDog",11);
        Dog c1= new Dog("SuperDog",10);
        Dog c2= new Dog("FlashDog",9);
        Dog c3= new Dog("GreenDog",6);
        Dog c4= new Dog("LanterDog",6);
        Dog c5= new Dog("MarvelDog",9);
        Dog c6= new Dog("RobinDog",5);
        Dog c7= new Dog("ThanosDog",13);
        Dog c8= new Dog("IronDog",11);
        Dog c9= new Dog("SpiderDog",8);

        dogs.add(c0);
        dogs.add(c1);
        dogs.add(c2);
        dogs.add(c3);
        dogs.add(c4);
        dogs.add(c5);
        dogs.add(c6);
        dogs.add(c7);
        dogs.add(c8);
        dogs.add(c9);


        //saving file
        FileOutputStream fo=null;

        try{
            fo=new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);
            dos.writeObject(dogs);
        }catch (FileNotFoundException e){
            System.out.println("ERROR: "+e.getMessage());

        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());

        }

        //recuperacao do arquivo serializado
        List<Dog> dogs2=null;
        FileInputStream fi=null;

        try{
            fi=new FileInputStream("OutputFile.txt");
            ObjectInputStream ois=new ObjectInputStream(fi);
            dogs2=(ArrayList) ois.readObject();//<=casting
        }catch (FileNotFoundException e){
            System.out.println("ERROR: "+e.getMessage());

        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());

        }

        //imprimir
        for (Dog dog:dogs2) System.out.println(
                dog.getNome()
                +" - "
                +dog.getIdade()
        );
    }



}
