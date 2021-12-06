package com.hibernate.monoivern.controller;

import com.hibernate.monoivern.model.Jogador;
import com.hibernate.monoivern.model.Treinador;
import com.hibernate.monoivern.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private JogadorRepository jogadorRepository;

    @Autowired
    public JogadorController(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    @PostMapping
    private ResponseEntity<Jogador> cadastrarJogador(@RequestBody Jogador jogador){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorRepository.save(jogador));

    }
    @GetMapping
    private ResponseEntity<List<Jogador>> listarJogadoresCadastrados(){
        return ResponseEntity.ok(jogadorRepository.findAll());
    }

    @GetMapping("/nome/{nome}")
    private ResponseEntity<Optional<Jogador>>  listarJogadorPorNome(@PathVariable String nome){
        return ResponseEntity.ok(jogadorRepository.findByNome(nome));
    }

//    QUERY POSTMAN
//    {
//        "nome":"Binho",
//            "timeFavorito":"São Paulo",
//            "treinador": {
//                "nome": "Murici",
//                "idade": 51
//    }
//    }






}
