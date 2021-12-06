public class DepartamentoComercial extends Handler{

    @Override
    public void verify(Mail mail){
        if(mail.getDestino().equalsIgnoreCase("Comercial@colmeia.com")||(mail.getAssunto().equalsIgnoreCase("comercial"))){
            System.out.println("Email enviado ao seto comercial");

        }else{
            if(this.getNext()!=null){
                this.getNext().verify(mail);
            }
        }
    }
}
