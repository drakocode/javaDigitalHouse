package serviceTest;

import impl.implModel.EnderecoDaoH2;
import impl.implModel.PacienteDaoH2;
import model.Endereco;
import model.Paciente;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import service.EnderecoService;
import service.PacienteService;

import java.util.Date;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PacienteServiceTest {


 private static PacienteService pacienteService=new PacienteService(new PacienteDaoH2(new EnderecoDaoH2()));
 private EnderecoService enderecoService=new EnderecoService(new EnderecoDaoH2());

 @BeforeClass
    public static void cadastrarPacientes(){
     Endereco endereco0=new Endereco("rua0","8880","cidade0","estado0");
     Paciente paciente0= pacienteService.save(new Paciente("Erik0","Kayser0","46546546",new Date(), endereco0));

     Endereco endereco1=new Endereco("rua1","8881","cidade1","estado1");
     Paciente paciente1= pacienteService.save(new Paciente("Erik1","Kayser1","46546546",new Date(), endereco1));


 }

    @Test
    public void SaveNSearch(){
     Endereco endereco = new Endereco("rua2","1362","cidade2","estado2");
     Paciente paciente= pacienteService.save(new Paciente("Erik2","Kayser2","5346546",new Date(),endereco));

        Assert.assertNotNull(pacienteService.search(paciente.getId()));

 }

    @Test
    public void deleteTest(){
     pacienteService.delete(6);
     Assert.assertTrue(pacienteService.search(6).isEmpty());
    }

    @Test
    public void searchAllTest(){
     List<Paciente> pacientes = pacienteService.searchAll();
     Assert.assertTrue(!pacientes.isEmpty());

        //verifique antes a quantidade de itens na lista
        Assert.assertTrue(pacientes.size()==2);
        System.out.println(pacientes);
    }





}
