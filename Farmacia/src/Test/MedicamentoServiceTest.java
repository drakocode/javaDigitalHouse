package Test;

import config.ConfigurationJDBC;
import impl.MedicamentoDaoH2;
import model.Medicamento;
import org.testng.Assert;
import service.MedicamentoService;

import org.testng.annotations.Test;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MedicamentoServiceTest {

    private MedicamentoService service=new MedicamentoService(new MedicamentoDaoH2(new ConfigurationJDBC()));

    @Test
    public void saveMedicamentoTest(){
        Medicamento medicamento= new Medicamento("Rivotril","DeathLab",888,110.0);
        service.save(medicamento);
        Assert.assertTrue(medicamento !=null);
    }

    @Test
    public void searchIdTest(){
        Medicamento medicamento= service.search(1);
        Assert.assertTrue(medicamento !=null);
    }











}
