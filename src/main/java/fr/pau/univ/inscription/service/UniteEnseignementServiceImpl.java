package fr.pau.univ.inscription.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pau.univ.inscription.dao.UniteEnseignement;
import fr.pau.univ.inscription.dao.UniteEnseignementRepository;

@Service
@Transactional
public class UniteEnseignementServiceImpl implements IUniteEnseignementService{
	@Autowired
	private UniteEnseignementRepository uniteEnseignementRepository ;

	@Override
	public List<UniteEnseignement> findAllUniteEnseignement() {
	
		return uniteEnseignementRepository.findAll();
	}
	
	

}

