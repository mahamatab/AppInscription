package fr.pau.univ.inscription.service;

import java.util.List;

import fr.pau.univ.inscription.dao.Inscription;

public interface IInscriptionService {
	
	List<Inscription> findAllInscription();

}