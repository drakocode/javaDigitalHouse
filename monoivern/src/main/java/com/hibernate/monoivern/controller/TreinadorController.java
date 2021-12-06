package com.hibernate.monoivern.controller;

import com.hibernate.monoivern.model.Jogador;
import com.hibernate.monoivern.model.Treinador;
import com.hibernate.monoivern.repository.JogadorRepository;
import com.hibernate.monoivern.repository.TreinadorRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/treinador")
public class TreinadorController {

    private TreinadorRepository treinadorRepository;

    public TreinadorController(TreinadorRepository treinadorRepository) {
        this.treinadorRepository = treinadorRepository;
    }

    @Autowired

    @PostMapping
    private ResponseEntity<Treinador> cadastrarTreinador(@RequestBody Treinador treinador){
        return ResponseEntity.status(HttpStatus.CREATED).body(treinadorRepository.save(treinador));

    }
    @GetMapping
    private ResponseEntity<List<Treinador>> listarTreinadoresCadastrados(){
        return ResponseEntity.ok(treinadorRepository.findAll());
    }

    @GetMapping("/nome/{nome}")
    private ResponseEntity<Optional<Treinador>>  listarTreinadorPorNome(@PathVariable String nome){
        return ResponseEntity.ok(treinadorRepository.findByNome(nome));
    }



}
