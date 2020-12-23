package fr.pau.univ.inscription.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.pau.univ.inscription.dao.Diplome;
import fr.pau.univ.inscription.service.IDiplomeService;

@RestController
@RequestMapping("/diplomes")
public class DiplomeController {
	@Autowired
	private IDiplomeService diplomeService;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Diplome> getAllDiplomes(){
		return diplomeService.findAllDiplome();
	}

}
