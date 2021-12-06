package com.escola.escola.repository;


import com.escola.escola.model.classe.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
