package com.mercadao.produtosms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mercadao.produtosms.domain.Produto;
import com.mercadao.produtosms.dto.ProdutoComTicketDTO;
import com.mercadao.produtosms.repository.ProdutoRepository;
import com.mercadao.produtosms.service.TicketService;

@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Autowired
	TicketService ticketService;
	
	@GetMapping(value="/produto1")
	public Iterable<Produto> findAll1() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(value="/produto")
	public List<ProdutoComTicketDTO> findAll() {
		Iterable<Produto> produtos = produtoRepository.findAll();
	    List<ProdutoComTicketDTO> produtosComTicket = new ArrayList<>();

	    for (Produto produto : produtos) {
	        ProdutoComTicketDTO dto = new ProdutoComTicketDTO();
	        dto.setProdutoId(produto.getProdutoId());
	        dto.setNome(produto.getProdutoName());
	        dto.setTicket(ticketService.findByProdutoId(produto.getProdutoId()));

	        produtosComTicket.add(dto);
	    }

	    return produtosComTicket;
	}

	
	@GetMapping(value="/produto/{produtoId}")
	public Produto findByAccountId (@PathVariable Integer produtoId) {
		
		Produto produto = produtoRepository.findByProdutoId(produtoId);
		
		produto.setTicket(ticketService.findByProdutoId(produtoId));
		
		return produto;
	}
}
