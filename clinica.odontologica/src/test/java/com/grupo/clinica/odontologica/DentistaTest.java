package com.grupo.clinica.odontologica;

import com.grupo.clinica.odontologica.model.Dentista;
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
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
public class DentistaTest {



    @Autowired
    private ConsultaService consultaService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private DentistaService dentistaService;


    @BeforeAll
    public void carregarDados(){
        Dentista dentista = new Dentista("João", "Pereira", 33663);
    }

    @Test
    public void cadastrarTest() {
        Dentista dentista = new Dentista("João", "Pereira", 33663);
        this.carregarDados();
        dentistaService.cadastrar(new Dentista(dentista));
        Assert.assertNotNull(consultaService.buscar(1L));
    }

    @Test
    public void excluirTest() {
        dentistaService.excluir(1L);
        Assert.assertTrue(dentistaService.buscar(1L).isEmpty());
    }

    @Test
    public void buscarTodosTest() {
        List<Dentista> dentistas = dentistaService.buscarTodos();
        Assert.assertTrue(!dentistas.isEmpty());
        Assert.assertTrue(dentistas.size() == 1);
    }

}
