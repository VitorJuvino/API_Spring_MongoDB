package com.biblioteca.atividade_bd.repositories;

import com.biblioteca.atividade_bd.models.Livros;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LivrosRepository extends MongoRepository<Livros, String> {


}
