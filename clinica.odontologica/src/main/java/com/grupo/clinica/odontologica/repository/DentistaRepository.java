package com.grupo.clinica.odontologica.repository;

import com.grupo.clinica.odontologica.model.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistaRepository extends JpaRepository<Dentista, Long> {
}
