package com.mfs.apiestoqueprodutos.repository;

import com.mfs.apiestoqueprodutos.document.Produto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProdutoRepository extends ReactiveMongoRepository<Produto,String> {
}
