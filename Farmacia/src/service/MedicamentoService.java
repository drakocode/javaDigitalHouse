package service;

import impl.IDao;
import model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento save(Medicamento medicamento){
        return medicamentoIDao.save(medicamento);
    }

    public Medicamento search (Integer id){
        return medicamentoIDao.search(id);
    }


}
