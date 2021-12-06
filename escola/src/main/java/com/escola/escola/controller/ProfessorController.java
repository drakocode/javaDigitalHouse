package com.escola.escola.controller;

import com.escola.escola.model.classe.Aluno;
import com.escola.escola.model.classe.Professor;
import com.escola.escola.repository.AlunoRepository;
import com.escola.escola.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private ProfessorRepository professorRepository;

    @Autowired
    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @PostMapping
    private ResponseEntity<Professor> cadastraAluno(@RequestBody Professor professor){
        return ResponseEntity.status(HttpStatus.CREATED).body(professorRepository.save(professor));
    }

    @GetMapping
    private ResponseEntity<List<Professor>> listarTodos(){
        return ResponseEntity.ok(professorRepository.findAll());
    }
}
