package com.johnnys.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnnys.cursomc.domain.Categoria;
import com.johnnys.cursomc.repositories.CategoriaRepository;
import com.johnnys.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
//		return obj.orElse(null);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
