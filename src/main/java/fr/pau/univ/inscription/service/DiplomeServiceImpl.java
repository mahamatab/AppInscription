package fr.pau.univ.inscription.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pau.univ.inscription.dao.Diplome;
import fr.pau.univ.inscription.dao.DiplomeRepository;

@Service
@Transactional
public class DiplomeServiceImpl implements IDiplomeService{
	@Autowired
	private DiplomeRepository diplomeRepository ;

	@Override
	public List<Diplome> findAllDiplome() {
	
		return diplomeRepository.findAll();
	}
	
	

}
