package service;

import impl.IDao;
import model.Dentista;

import java.util.List;
import java.util.Optional;

public class DentistaService {
    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista save(Dentista dentista){
        dentistaIDao.save(dentista);
        return dentista;
    }

    public Optional<Dentista> search(Integer id){
        return dentistaIDao.search(id);
    }

    public void delete(Integer id){
        dentistaIDao.delete(id);
    }

    public List<Dentista> searchAll(){
        return dentistaIDao.searchAll();
    }
}
