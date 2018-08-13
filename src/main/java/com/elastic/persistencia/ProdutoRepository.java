package com.elastic.persistencia;

import com.elastic.dominio.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProdutoRepository extends ElasticsearchRepository<Produto, String> {
}
