package com.mercadao.produtosms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.mercadao.produtosms.domain.Produto;
import com.mercadao.produtosms.repository.ProdutoRepository;

@SpringBootApplication
@EnableFeignClients
public class ProdutosMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosMsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(ProdutoRepository repo) {
		return args -> {
			repo.deleteAll();

			Produto p = new Produto();
			p.setProdutoid(1001);
			p.setProdutoName("Cerveja");
			repo.save(p);
			
			Produto p2 = new Produto();
			p2.setProdutoid(1002);
			p2.setProdutoName("Café");
			repo.save(p2);

		};
	}

}
