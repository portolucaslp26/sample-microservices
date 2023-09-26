package com.mercadao.produtosms.domain;

public class Ticket {
	
	Integer ticketId;
	Integer numeroPremiado;
	String status;
	
	public Ticket() {
		super();
	}
	
	public Integer getTicketId() {
		return ticketId;
	}
	
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	
	public Integer getNumeroPremiado() {
		return numeroPremiado;
	}
	
	public void setNumeroPremiado(Integer numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
