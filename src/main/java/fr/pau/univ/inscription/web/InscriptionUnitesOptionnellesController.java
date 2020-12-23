package fr.pau.univ.inscription.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.pau.univ.inscription.dao.InscriptionUnitesOptionnelles;
import fr.pau.univ.inscription.service.IInscriptionUnitesOptionnellesService;

@RestController
@RequestMapping("/InscriptionUnitesOptionnelles")
public class InscriptionUnitesOptionnellesController {
	@Autowired
	private IInscriptionUnitesOptionnellesService inscriptionUnitesOptionnellesService;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<InscriptionUnitesOptionnelles> getAllInscriptionUnitesOptionnelles(){
		return inscriptionUnitesOptionnellesService.findAllInscriptionUnitesOptionnelles();
	}

}

