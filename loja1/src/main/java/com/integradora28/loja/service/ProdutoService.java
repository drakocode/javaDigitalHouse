package com.integradora28.loja.service;

import com.integradora28.loja.model.Produto;

import java.util.List;

public interface ProdutoService {

    public List<Produto> listarTodos();
    public Produto cadastrar(Produto produto);
    public void excluir(Long id);
    public Produto atualizar (Produto produto);
}
