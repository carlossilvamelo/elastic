package com.elastic;

import com.elastic.dominio.Produto;
import com.elastic.persistencia.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticApplication {


    @Autowired
    private ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ElasticApplication.class, args);
      //  Produto save = produtoRepository.save(new Produto());
    }
}
