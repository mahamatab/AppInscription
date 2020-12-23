package fr.pau.univ.inscription.service;

import java.util.List;

import fr.pau.univ.inscription.dao.InscriptionUnitesOptionnelles;

public interface IInscriptionUnitesOptionnellesService {
	
	List<InscriptionUnitesOptionnelles> findAllInscriptionUnitesOptionnelles();

}
