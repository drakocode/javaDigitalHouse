public class DepartamentoTecnico extends Handler{

    @Override
    public void verify(Mail mail){
        if(mail.getDestino().equalsIgnoreCase("tecnico@colmeia.com")||(mail.getAssunto().equalsIgnoreCase("tecnico"))){
            System.out.println("Email enviado ao seto tecnico");

        }else{
            if(this.getNext()!=null){
                this.getNext().verify(mail);
            }
        }
    }
}
