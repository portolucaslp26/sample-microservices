package com.mercadao.ticketms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mercadao.ticketms.domain.Ticket;
import com.mercadao.ticketms.repository.TicketRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketMsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(TicketRepository repo) {
		return args -> {
			repo.deleteAll();

			Ticket t = new Ticket();
			t.setProdutoid(1001);
			t.setNumeroPremiado(101);
			t.setStatus("ativo");
			t.setTicketId(99);
			repo.save(t);
			
			Ticket t2 = new Ticket();
			t2.setProdutoid(1002);
			t2.setNumeroPremiado(102);
			t2.setStatus("ativo");
			t2.setTicketId(94);
			repo.save(t2);

		};
	}

}
