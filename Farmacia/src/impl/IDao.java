package impl;

public interface IDao <T>{

    public T save(T t);

    public T search(Integer id);


}
