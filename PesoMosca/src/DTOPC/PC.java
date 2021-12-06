package DTOPC;

public class PC {
    private int ram;
    private int HD;
    private static int id;
    private static int contador;

    public PC(int ram, int HD) {
        this.ram = ram;
        this.HD = HD;
        id++;
        contador++;
        System.out.println("contador: "+id+" id: "+contador);
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHD() {
        return HD;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }


    @Override
    public String toString() {
        return "PC " +
                "ram=" + ram +
                ", HD=" + HD
                ;
    }
}
