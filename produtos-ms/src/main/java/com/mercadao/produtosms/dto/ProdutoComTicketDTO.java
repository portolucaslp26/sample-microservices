package com.mercadao.produtosms.dto;

import com.mercadao.produtosms.domain.Ticket;

public class ProdutoComTicketDTO {
    private Integer produtoId;
    private String nome;
    private Ticket ticket;

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
