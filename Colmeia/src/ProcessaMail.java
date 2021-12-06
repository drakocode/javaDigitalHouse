public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail check=new CheckMail();
        check.verify(new Mail("sabadasso@88.com","tecnico@colmeia.com","tecnico"));

        check.verify(new Mail("sabadasso@828.com","comercial@colmeia.com","comercial"));

        check.verify(new Mail("sabadasso@838.com","tdasdao@colmeia.com","tadsadasdco"));



    }
}
