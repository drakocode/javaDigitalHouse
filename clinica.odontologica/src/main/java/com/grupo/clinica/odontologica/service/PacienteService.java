package com.grupo.clinica.odontologica.service;

import com.grupo.clinica.odontologica.model.Paciente;
import com.grupo.clinica.odontologica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService{

    private PacienteRepository pacienteRepository;

    @Autowired
    public Paciente cadastrar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Optional<Paciente> buscar(Long id) {
        return pacienteRepository.findById(id);
    }

    public void excluir(Long id) {
        pacienteRepository.deleteById(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    public Paciente atualizar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
