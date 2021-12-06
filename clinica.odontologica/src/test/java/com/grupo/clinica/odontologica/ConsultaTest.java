package com.grupo.clinica.odontologica;

import com.grupo.clinica.odontologica.model.Consulta;
import com.grupo.clinica.odontologica.model.Dentista;
import com.grupo.clinica.odontologica.model.Endereco;
import com.grupo.clinica.odontologica.model.Paciente;
import com.grupo.clinica.odontologica.repository.ConsultaRepository;
import com.grupo.clinica.odontologica.service.ConsultaService;
import com.grupo.clinica.odontologica.service.DentistaService;
import com.grupo.clinica.odontologica.service.PacienteService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
public class ConsultaTest {


    private ConsultaService consultaService = new ConsultaService();
    private PacienteService pacienteService = new PacienteService();
    private DentistaService dentistaService = new DentistaService();

    private ConsultaRepository consultaRepository;


    public void constructorConsultaRepository(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }


    @BeforeAll
    public static void carregarDados() {
        PacienteService pacienteService = new PacienteService();
        DentistaService dentistaService = new DentistaService();


        Endereco endereco = new Endereco("Av Santa fe", "444", "São Paulo", "São Paulo");
        Paciente p = pacienteService.cadastrar(new Paciente("Vicente", "Santos", "88888888", new Date(), endereco));
        Dentista d = dentistaService.cadastrar(new Dentista("dentista","d",1));

        Endereco endereco1 = new Endereco("Av das Margaridas", "333", "Belo Horizonte", "Minas Gerais");
        Paciente p1 = pacienteService.cadastrar(new Paciente("Marcela", "Moura", "99999999", new Date(), endereco1));
        Dentista d1 = dentistaService.cadastrar(new Dentista("dentista1","d1",2));

    }

    @Test
    public void cadastrarTest() {
        Endereco endereco = new Endereco("Rua sem Saida", "123", "São Paulo", "São Paulo");
        Paciente p = pacienteService.cadastrar(new Paciente("Vicente", "Santos", "88888888", new Date(), endereco));
        Dentista d = dentistaService.cadastrar(new Dentista("dentista","d",1));

        Consulta c = consultaService.cadastrarGambiarra(new Paciente(p), new Dentista(d));

        Assert.assertNotNull(consultaService.buscar(c.getId()));
    }

    @Test
    public void buscarConsultaTest(Long id){
        consultaRepository.findById(id);
        Assert.assertNotNull(consultaService.buscar(id));
    }

    @Test
    public void excluirConsultaTest() {
        consultaService.excluir(3L);
        Assert.assertTrue(consultaService.buscar(3L).isEmpty());

    }

    @Test
    public void buscarTodasConsultasTest() {
        List<Consulta> consultas=new ArrayList<>();

        Endereco endereco = new Endereco("Av Santa fe", "444", "São Paulo", "São Paulo");
        Consulta c1 =new Consulta(new Paciente("Vicente", "Santos", "88888888", new Date(), endereco),new Dentista("dentista1","d1",2));

        consultas.add(c1);

        consultaRepository.findAll();

        Assert.assertTrue(!consultas.isEmpty());
        Assert.assertTrue(consultas.size() == 2);
        System.out.println(c1);

    }

    @Test
    public void atualizarConsultaTest(){
        Endereco endereco = new Endereco("Av Santa fe", "444", "São Paulo", "São Paulo");
        Consulta c1 =new Consulta(new Paciente("Vicente", "Santos", "88888888", new Date(), endereco),new Dentista("dentista1","d1",2));

        consultaService.atualizar(c1);


        System.out.println(c1);
        Assert.assertTrue(consultaService.buscar(3L).isPresent());

    }

}
