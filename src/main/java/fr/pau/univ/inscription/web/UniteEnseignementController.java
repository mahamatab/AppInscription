package fr.pau.univ.inscription.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.pau.univ.inscription.dao.UniteEnseignement;
import fr.pau.univ.inscription.service.IUniteEnseignementService;

@RestController
@RequestMapping("/uniteEnseignements")
public class UniteEnseignementController {
	@Autowired
	private IUniteEnseignementService uniteEnseignementService;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<UniteEnseignement> getAllDiplomes(){
		return uniteEnseignementService.findAllUniteEnseignement();
	}

}
