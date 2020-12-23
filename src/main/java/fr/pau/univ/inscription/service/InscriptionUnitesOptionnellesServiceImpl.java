package fr.pau.univ.inscription.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pau.univ.inscription.dao.InscriptionUnitesOptionnelles;
import fr.pau.univ.inscription.dao.InscriptionUnitesOptionnellesRepository;

@Service
@Transactional
public class InscriptionUnitesOptionnellesServiceImpl implements IInscriptionUnitesOptionnellesService{
	@Autowired
	private InscriptionUnitesOptionnellesRepository InscriptionUnitesOptionnellesRepository ;

	@Override
	public List<InscriptionUnitesOptionnelles> findAllInscriptionUnitesOptionnelles() {
	
		return InscriptionUnitesOptionnellesRepository.findAll();
	}
	
	

}
