package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.essat.model.Categorie;

public interface Icategorie  extends JpaRepository<Categorie, Integer>{
	
}
