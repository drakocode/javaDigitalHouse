package com.grupo.clinica.odontologica.service;

import com.grupo.clinica.odontologica.model.Dentista;
import com.grupo.clinica.odontologica.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DentistaService {

    @Autowired
    private DentistaRepository dentistaRepository;

    public Dentista cadastrar(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    public Optional<Dentista> buscar(Long id) {
        return dentistaRepository.findById(id);
    }

    public void excluir(Long id) {
        dentistaRepository.deleteById(id);
    }

    public List<Dentista> buscarTodos() {
        return dentistaRepository.findAll();
    }

    public Dentista atualizar(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }
}
