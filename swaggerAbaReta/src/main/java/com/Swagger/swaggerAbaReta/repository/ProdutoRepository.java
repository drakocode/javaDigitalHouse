package com.Swagger.swaggerAbaReta.repository;


import com.Swagger.swaggerAbaReta.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, Integer>{
}
