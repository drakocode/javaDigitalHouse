public class CheckMail {
    Handler initial;


    public CheckMail(){
        this.initial=new DepartamentoGerencial();
        Handler tecnico = new DepartamentoTecnico();
        Handler comercial=new DepartamentoComercial();
        Handler spam=new HandlerSpam();

        initial.setNext(tecnico);
        tecnico.setNext(comercial);
        comercial.setNext(spam);


    }


    public void verify(Mail mail){
        initial.verify(mail);
    }










}
