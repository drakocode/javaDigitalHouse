package com.grupo.clinica.odontologica.repository;

import com.grupo.clinica.odontologica.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository <Consulta, Long> {
}
