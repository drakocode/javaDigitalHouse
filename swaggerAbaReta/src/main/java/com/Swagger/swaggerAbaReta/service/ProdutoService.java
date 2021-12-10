package com.Swagger.swaggerAbaReta.service;

import com.Swagger.swaggerAbaReta.model.Produto;
import com.Swagger.swaggerAbaReta.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    public Produto buscar(Integer id){
        return  produtoRepository.findById(id).orElseGet(null);
    }

    public void delete(Integer id){
        produtoRepository.deleteById(id);
    }
}
