package com.Swagger.swaggerAbaReta.controller;

import com.Swagger.swaggerAbaReta.model.Produto;
import com.Swagger.swaggerAbaReta.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    //anotação do swagger
    @Operation(summary = "Registrar um novo produto")
    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return produtoService.salvar(produto);
    }

    @Operation(summary = "Listar todos os produtos")
    @GetMapping
    public List<Produto> listar(){
        return produtoService.listar();
    }

    @Operation(summary = "Buscar produto pelo id")
    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Integer id){
        return produtoService.buscar(id);
    }

    @Operation(summary = "Eliminar produto pelo id")
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        produtoService.delete(id);
        return "Produto deletado";
    }


    //LINK DE ACESSO
//    http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config


}
