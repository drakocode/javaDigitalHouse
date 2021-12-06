public class DepartamentoGerencial extends Handler{

    @Override
    public void verify(Mail mail){
        if(mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")||(mail.getAssunto().equalsIgnoreCase("gerencial"))){
        System.out.println("Email enviado ao seto gerencial");

        }else{
            if(this.getNext()!=null){
                this.getNext().verify(mail);
            }
        }
    }
}
