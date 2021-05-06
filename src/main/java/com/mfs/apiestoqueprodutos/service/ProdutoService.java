package com.mfs.apiestoqueprodutos.service;

import com.mfs.apiestoqueprodutos.document.Produto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProdutoService {

    Flux<Produto> findAll();
    Mono<Produto> findByID(String id);
    Mono<Produto> save(Produto produto);
    Mono<Produto> update(Produto produto);
    Mono<Produto> delete(String id);

}
