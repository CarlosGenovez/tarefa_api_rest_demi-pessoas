package br.com.tarefaapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tarefaapirest.domain.Pessoas;

@SpringBootApplication
public class TarefaApiRestDemiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarefaApiRestDemiApplication.class, args);
		
		String nome = "Carlos";
		
		System.out.println("Hello Brothers");
		
		Pessoas pessoas = new Pessoas ();
		Pessoas pessoas2 = new Pessoas();
		
		pessoas.setNome(nome);
		System.out.println(pessoas.getNome());
		
		pessoas2.setNome("Vitor");
		System.out.println(pessoas2.getNome());
		
		
	
		
	}

}
