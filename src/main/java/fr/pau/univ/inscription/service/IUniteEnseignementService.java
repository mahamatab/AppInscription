package fr.pau.univ.inscription.service;

import java.util.List;

import fr.pau.univ.inscription.dao.UniteEnseignement;

public interface IUniteEnseignementService {
	
	List<UniteEnseignement> findAllUniteEnseignement();

}
