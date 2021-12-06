package com.mongodb.mongodbTransportadora.repository;

import com.mongodb.mongodbTransportadora.model.Pacote;
import com.mongodb.mongodbTransportadora.model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacoteRepository extends MongoRepository<Pacote, Integer> {

    List<Pacote> findAllByStatus(Status status);
}
