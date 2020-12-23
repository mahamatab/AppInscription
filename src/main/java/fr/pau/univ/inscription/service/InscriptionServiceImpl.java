package fr.pau.univ.inscription.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pau.univ.inscription.dao.Inscription;
import fr.pau.univ.inscription.dao.InscriptionRepository;

@Service
@Transactional
public class InscriptionServiceImpl implements IInscriptionService{
	@Autowired
	private InscriptionRepository diplomeRepository ;

	@Override
	public List<Inscription> findAllInscription() {
	
		return diplomeRepository.findAll();
	}
	
	

}