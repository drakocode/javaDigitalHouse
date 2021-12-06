package impl;

import java.util.List;
import java.util.Optional;

public interface IDao <T>{

    public T save(T t);
    public Optional<T> search(Integer id);
    public void delete(Integer id);
    public List<T> searchAll();

}
