package com.mongodb.mongodbTransportadora.controller;

import com.mongodb.mongodbTransportadora.model.Pacote;
import com.mongodb.mongodbTransportadora.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacote")
public class PacoteController {

    private PacoteService pacoteService;

    //constructor
    //
    //
    @Autowired
    public PacoteController(PacoteService pacoteService) {
        this.pacoteService = pacoteService;
    }

    //methods
    //
    //
    @PostMapping
    public Pacote registrar(@RequestBody Pacote pacote){
        return pacoteService.add(pacote);
    }

    @GetMapping
    public List<Pacote> buscarTodos(){
        return pacoteService.listar();
    }
    @GetMapping("/a-caminho")
    public List<Pacote> buscarACaminho(){
        return pacoteService.listarPacoteACaminho();
    }


    //cadastrar produto template json
//    {
//        "id": 1,
//            "codigo":"123456",
//            "nome":"pacote",
//            "status": 1,
//            "destino": {
//        "rua":"Rua dos Oliveiras",
//                "numero": 123,
//                "cidade": "Cidade",
//                "estado": "Estado"
//    }
//    }

}
