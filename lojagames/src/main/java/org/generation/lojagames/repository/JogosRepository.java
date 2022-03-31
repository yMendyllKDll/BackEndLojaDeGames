package org.generation.lojagames.repository;

import java.util.List;
import org.generation.lojagames.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosRepository extends JpaRepository<Jogos, Long>{
	public List<Jogos> findAllByNomeContainingIgnoreCase(String nome);
}
