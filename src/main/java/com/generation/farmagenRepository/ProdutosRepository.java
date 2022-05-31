package com.generation.farmagenRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmagen.model.ProdutosModel;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long>{
	public List<ProdutosModel> findAllByNomeContainingIgnoreCase (String nome);

}