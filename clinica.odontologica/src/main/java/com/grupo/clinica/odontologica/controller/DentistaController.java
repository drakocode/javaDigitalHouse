package com.grupo.clinica.odontologica.controller;

import com.grupo.clinica.odontologica.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dentista")
public class DentistaController {

    private DentistaRepository dentistaRepository;

    @Autowired
    public DentistaController(DentistaRepository dentistaRepository) {
        this.dentistaRepository = dentistaRepository;
    }



}
