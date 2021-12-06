package com.grupo.clinica.odontologica.controller;

import com.grupo.clinica.odontologica.model.Consulta;
import com.grupo.clinica.odontologica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {


    private ConsultaRepository consultaRepository;

    @Autowired
    public void ConsultaRepository(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @PostMapping
    public ResponseEntity<Consulta> cadastrar(@RequestBody Consulta consulta){
        return ResponseEntity.status(HttpStatus.CREATED).body(consultaRepository.save(consulta));
    }

    @GetMapping("/consultas")
    public  ResponseEntity<Consulta> buscarPorId (@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(consultaRepository.getById(id));
    }


    @PutMapping
    public ResponseEntity<Consulta> atualizar(@RequestBody Consulta consulta){

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(consultaRepository.save(consulta));

    }


    //isso aqui tava dando erro depois do build, posso ter configurado errado a partir do .status
    //
    //
    //
//    @DeleteMapping("/consultas/{id}")
//    public ResponseEntity<Consulta> excluirPorId(@PathVariable Consulta consulta){
//
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build(consultaRepository.delete(consulta));
//
//    }

    @GetMapping("consultas")
    public ResponseEntity <List<Consulta>> buscarTodos(){
        return ResponseEntity.ok(consultaRepository.findAll());
    }

}
