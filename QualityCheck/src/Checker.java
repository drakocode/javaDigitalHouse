public abstract class Checker {
    protected Checker nextChecker;

    public Checker getNext(){
        return this.nextChecker;
    }

    public void setNext(Checker checker){
        this.nextChecker=checker;
    }

    public abstract void verify(Produto produto);



}
