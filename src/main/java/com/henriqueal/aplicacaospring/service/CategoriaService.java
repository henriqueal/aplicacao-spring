package com.henriqueal.aplicacaospring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henriqueal.aplicacaospring.domain.Categoria;
import com.henriqueal.aplicacaospring.repository.CategoriaRepository;
import com.henriqueal.aplicacaospring.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado. Id: " + id
				+ ", Tipo: " + Categoria.class.getName()));
	}
}
