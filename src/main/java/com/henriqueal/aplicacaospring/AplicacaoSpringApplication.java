package com.henriqueal.aplicacaospring;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henriqueal.aplicacaospring.domain.Categoria;
import com.henriqueal.aplicacaospring.repository.CategoriaRepository;

@SpringBootApplication
public class AplicacaoSpringApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AplicacaoSpringApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
