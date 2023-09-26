package com.mercadao.ticketms.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TICKETS")
@Entity
public class Ticket implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id//Pk
	@Column(name="ticketId")
	Integer ticketId;
	
	@Column(name="numeroPremiado")
	Integer numeroPremiado;
	
	@Column(name="status")
	String status;
	
	@Column(name="produtoId")
	Integer produtoId;
		
	public Ticket() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", numeroPremiado=" + numeroPremiado + ", status=" + status
				+ ", produtoid=" + produtoId + "]";
	}



	public Ticket(Integer ticketId, Integer numeroPremiado, String status, Integer produtoId) {
		super();
		this.ticketId = ticketId;
		this.numeroPremiado = numeroPremiado;
		this.status = status;
		this.produtoId = produtoId;
	}



	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoid(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getNumeroPremiado() {
		return numeroPremiado;
	}

	public void setNumeroPremiado(Integer numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}
}
