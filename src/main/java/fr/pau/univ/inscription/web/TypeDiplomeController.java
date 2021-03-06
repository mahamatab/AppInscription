package fr.pau.univ.inscription.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.pau.univ.inscription.dao.TypeDiplome;
import fr.pau.univ.inscription.service.ITypeDiplomeService;

@RestController
@RequestMapping("/typediplomes")
public class TypeDiplomeController {
	@Autowired
	private ITypeDiplomeService typediplomeService;
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<TypeDiplome> getAllTypeDiplomes(){
		return typediplomeService.findAllTypeDiplome();
	}

}
