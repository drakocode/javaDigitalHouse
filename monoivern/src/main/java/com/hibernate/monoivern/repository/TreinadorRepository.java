package com.hibernate.monoivern.repository;

import com.hibernate.monoivern.model.Jogador;
import com.hibernate.monoivern.model.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TreinadorRepository extends JpaRepository<Treinador, Long> {

    //para criar um novo Treinador, podemos usar o metodo save do jpa
    //para listar todos os Treinadores podemos usar o metodo findAll do jpa

    @Query("SELECT t FROM Treinador t WHERE t.nome = ?1")
    Optional<Treinador> findByNome(String nomeCompleto);

    @Query("SELECT j  FROM Treinador j WHERE j.nome = ?1")
    List<Jogador> findByNomeTreinador(String trechoNome);

}
