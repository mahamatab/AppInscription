package fr.pau.univ.inscription.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pau.univ.inscription.dao.TypeDiplome;
import fr.pau.univ.inscription.dao.TypeDiplomeRepository;

@Service
@Transactional
public class TypeDiplomeServiceImpl implements ITypeDiplomeService{
	@Autowired
	private TypeDiplomeRepository typeDiplomeRepository ;

	@Override
	public List<TypeDiplome> findAllTypeDiplome() {
	
		return typeDiplomeRepository.findAll();
	}
	
	

}
