package br.com.tarefaapirest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tarefaapirest.domain.Pessoas;

public interface RepositoriodePessoas extends MongoRepository<Pessoas, String> {
		
}


