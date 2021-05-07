package com.mfs.apiestoqueprodutos.controller;

import com.mfs.apiestoqueprodutos.document.Produto;
import com.mfs.apiestoqueprodutos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins ="*")
@RestController
public class ProdutoController {
    @Autowired
    ProdutoService service;

    @GetMapping(value = "/Produto")
    public Flux<Produto> getProdutoAll(){
        return service.findAll();
    }

    @GetMapping(value = "/Produto/{id}")
    public Mono<Produto> getProdutoId(@PathVariable String id){
        return service.findByID(id);
    }

    @PostMapping(value = "/Produto")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Produto> save(@RequestBody Produto produto){
        return service.save(produto);
    }

    @PutMapping(value = "/Produto")
    public Mono<Produto> update(@RequestBody Produto produto){
        return service.update(produto);
    }

    @DeleteMapping(value = "/Produto/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return service.delete(id);
    }

}
