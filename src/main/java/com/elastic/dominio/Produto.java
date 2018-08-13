package com.elastic.dominio;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "prod", type = "produto")
public class Produto {

    @Id
    private String id;
    private String produto;
    private String ano;
    private String estado;
    private String refinaria;
    private String unidade;


    public Produto() {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRefinaria() {
        return refinaria;
    }

    public void setRefinaria(String refinaria) {
        this.refinaria = refinaria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String toJson(){
        return "{'id'='"+getId()+"','produto'='"+getProduto()+"', 'ano' ='"+getAno()+"', estado = '"+getEstado()+"', refinaria = '"+getRefinaria()+"', unidade='"+getUnidade()+"'}";
    }

}
