package com.example.biblioteca.controller;

import com.example.biblioteca.model.Libro;//Model
import com.example.biblioteca.service.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }

    @GetMapping("{id}")
    public Libro getLibroPorId(@PathVariable int id){
        return libroService.getLibroPorId(id);
    }
    @GetMapping("/isbn/{isbn}")
    public Libro getLibroPorIsbn(@PathVariable String isbn){
        return libroService.getLibroPorIsbn(isbn);
    }
}
