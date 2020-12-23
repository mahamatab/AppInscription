package fr.pau.univ.inscription.service;

import java.util.List;

import fr.pau.univ.inscription.dao.TypeDiplome;

public interface ITypeDiplomeService {
	
	List<TypeDiplome> findAllTypeDiplome();

}
