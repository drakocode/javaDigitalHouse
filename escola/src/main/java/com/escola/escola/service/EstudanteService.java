package com.escola.escola.service;

import com.escola.escola.repository.EstudanteRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {

    private EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository){
        this.estudanteRepository=estudanteRepository;
    }





}
