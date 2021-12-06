public abstract class Handler {
    protected Handler nextHandler;

    public Handler getNext(){
        return this.nextHandler;
    }

    public void setNext(Handler handler){
        this.nextHandler=handler;
    }

    public abstract void verify(Mail mail);












}
