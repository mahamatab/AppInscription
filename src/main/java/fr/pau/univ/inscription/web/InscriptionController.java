package fr.pau.univ.inscription.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.pau.univ.inscription.dao.Inscription;
import fr.pau.univ.inscription.service.IInscriptionService;

@RestController
@RequestMapping("/inscriptions")
public class InscriptionController {
	@Autowired
	private IInscriptionService inscriptionService;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Inscription> getAllDiplomes(){
		return inscriptionService.findAllInscription();
	}

}
