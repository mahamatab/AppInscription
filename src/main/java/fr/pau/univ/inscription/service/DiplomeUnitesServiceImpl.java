package fr.pau.univ.inscription.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pau.univ.inscription.dao.DiplomeUnites;
import fr.pau.univ.inscription.dao.DiplomeUnitesRepository;

@Service
@Transactional
public class DiplomeUnitesServiceImpl implements IDiplomeUnitesService{
	@Autowired
	private DiplomeUnitesRepository diplomeUnitesRepository ;

	@Override
	public List<DiplomeUnites> findAllDiplomeUnites() {
	
		return diplomeUnitesRepository.findAll();
	}
	
	

}
