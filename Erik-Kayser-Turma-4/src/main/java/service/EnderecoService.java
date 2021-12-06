package service;

import impl.IDao;
import model.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco save(Endereco endereco){
        enderecoIDao.save(endereco);
        return endereco;
    }

    public Optional<Endereco> search(Integer id){
        return enderecoIDao.search(id);
    }

    public void delete(Integer id){
        enderecoIDao.delete(id);
    }

    public List<Endereco> searchAll(){
        return enderecoIDao.searchAll();
    }
}
