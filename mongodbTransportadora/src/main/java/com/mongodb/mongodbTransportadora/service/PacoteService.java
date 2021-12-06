package com.mongodb.mongodbTransportadora.service;

import com.mongodb.mongodbTransportadora.model.Pacote;
import com.mongodb.mongodbTransportadora.model.Status;
import com.mongodb.mongodbTransportadora.repository.PacoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacoteService {

    private PacoteRepository pacoteRepository;

    //constructor
    //
    //
    public PacoteService() {
    }
    public PacoteService(PacoteRepository pacoteRepository) {
        this.pacoteRepository = pacoteRepository;
    }


    //methods
    //
    //
    public Pacote add(Pacote pacote){
        return pacoteRepository.save(pacote);
    }
    public List<Pacote> listar(){
        return pacoteRepository.findAll();
    }

    public List<Pacote>listarPacoteACaminho(){
        return pacoteRepository.findAllByStatus(Status.A_CAMINHO);
    }




}
