package com.biblioteca.atividade_bd.controllers;

import com.biblioteca.atividade_bd.models.Livros;
import com.biblioteca.atividade_bd.repositories.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")

public class LivrosController {
    @Autowired
    private LivrosRepository livrosRepository;

    @GetMapping
    public List<Livros> listarLivros() {
        return livrosRepository.findAll();
    }

    // Métodos

    @PostMapping
    public Livros iserirLivros(@RequestBody Livros livros) {
        return livrosRepository.save(livros);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Livros> atualizarLivros(@PathVariable String id, @RequestBody Livros livros) {
        Optional<Livros> livrosExistente = livrosRepository.findById(id);

        if (livrosExistente.isPresent()) {
            Livros livrosAtualizado = livrosRepository.save(livros);
            return new ResponseEntity<>(livrosAtualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirLivros(@PathVariable String id) {
        Optional<Livros> livrosExistentes = livrosRepository.findById(id);

        if (livrosExistentes.isPresent()) {
            livrosRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
