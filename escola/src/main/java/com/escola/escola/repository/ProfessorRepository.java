package com.escola.escola.repository;


import com.escola.escola.model.classe.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
