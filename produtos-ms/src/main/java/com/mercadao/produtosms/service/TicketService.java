package com.mercadao.produtosms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mercadao.produtosms.domain.Ticket;

@FeignClient(name="ticket-service")
public interface TicketService {
	
	@GetMapping(value="/ticket/produto/{produtoId}")
	Ticket findByProdutoId (@PathVariable("produtoId") Integer produtoId);

}
