package com.mercadao.produtosms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="PRODUTOS")
@Entity
public class Produto {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="produtoId")
	Integer produtoId;
	
	@Column(name="produtoName")
	String produtoName;
	
	@Transient
	Ticket ticket;
	
	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoid(Integer produtoId) {
		this.produtoId = produtoId;
	}
	
	public String getProdutoName() {
		return produtoName;
	}

	public void setProdutoName(String produtoName) {
		this.produtoName = produtoName;
	}
	
	public Ticket getTicket() {
		return ticket;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
