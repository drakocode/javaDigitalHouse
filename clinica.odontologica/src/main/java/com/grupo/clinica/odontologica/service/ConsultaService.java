package com.grupo.clinica.odontologica.service;

import com.grupo.clinica.odontologica.model.Consulta;
import com.grupo.clinica.odontologica.model.Dentista;
import com.grupo.clinica.odontologica.model.Paciente;
import com.grupo.clinica.odontologica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta cadastrar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public Optional<Consulta> buscar(Long id) {
        return consultaRepository.findById(id);
    }

    public void excluir(Long id) {
        consultaRepository.deleteById(id);
    }

    public List<Consulta> buscarTodos() {
        return consultaRepository.findAll();
    }

    public Consulta atualizar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public Consulta cadastrarGambiarra(Paciente paciente, Dentista dentista) {
        Consulta consulta=new Consulta(paciente,dentista);
        return consultaRepository.save(consulta);
    }
}
