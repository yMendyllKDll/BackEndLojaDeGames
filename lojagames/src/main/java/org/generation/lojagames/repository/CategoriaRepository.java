package org.generation.lojagames.repository;

import java.util.List;

import org.generation.lojagames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
		public List<Categoria>findAllByEstiloContainingIgnoreCase(String estilo);
}
