package service;

import impl.IDao;
import model.Endereco;
import model.Paciente;

import java.util.List;
import java.util.Optional;

public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente save(Paciente paciente){
        pacienteIDao.save(paciente);
        return paciente;
    }

    public Optional<Paciente> search(Integer id){
        return pacienteIDao.search(id);
    }

    public void delete(Integer id){
        pacienteIDao.delete(id);
    }

    public List<Paciente> searchAll(){
        return pacienteIDao.searchAll();
    }
}
