package com.mfs.apiestoqueprodutos.service;

import com.mfs.apiestoqueprodutos.document.Produto;
import com.mfs.apiestoqueprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoServiceImpl implements  ProdutoService{

    @Autowired
    ProdutoRepository pr;

    @Override
    public Flux<Produto> findAll() {
        return pr.findAll();
    }

    @Override
    public Mono<Produto> findByID(String id) {
        return pr.findById(id);
    }

    @Override
    public Mono<Produto> save(Produto produto) {
        return pr.save(produto);
    }

    @Override
    public Mono<Produto> update(Produto produto) {
        return pr.insert(produto);
    }

    @Override
    public Mono<Produto> delete(String id) {
        pr.deleteById(id);
        return null;
    }
}
