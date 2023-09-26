package com.mercadao.ticketms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercadao.ticketms.domain.Ticket;
import com.mercadao.ticketms.repository.TicketRepository;

@RestController
public class TicketController {
	
	@Autowired
	TicketRepository ticketRepository;
	

	@GetMapping(value = "/ticket")
	public Iterable<Ticket> all (){
		return ticketRepository.findAll();
	}
	
	
	@RequestMapping(value = "/ticket/{numeroticket}/",method=RequestMethod.GET)
	public Ticket findByTicketId (@PathVariable Integer numeroticket){
		return ticketRepository.findTicketByNumeroPremiado(numeroticket);
	}
	
	@GetMapping(value = "/ticket/produto/{produtoId}")
	public Ticket findByTicketProduto (@PathVariable Integer produtoId){
		return ticketRepository.findAllByProdutoId(produtoId);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
	    Ticket createdTicket = ticketRepository.save(ticket);

	    return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
	}

}
