package com.hibernate.monoivern.repository;

import com.hibernate.monoivern.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    //para criar um novo jogador, podemos usar o metodo save do jpa
    //para listar todos os jogadores podemos usar o metodo findAll do jpa

    @Query("SELECT j FROM Jogador j WHERE j.nome = ?1")
    Optional<Jogador> findByNome(String nomeCompleto);

    @Query("SELECT j FROM Jogador j WHERE j.nome = ?1")
    List<Jogador> findByNomeContaining(String trechoNome);

}
