package com.mercadao.produtosms.repository;

import org.springframework.data.repository.CrudRepository;

import com.mercadao.produtosms.domain.Produto;


public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	Produto findByProdutoId(Integer produtoId);

}
