package fr.pau.univ.inscription.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UniteEnseignement  implements Serializable{
	
	//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=6,nullable=false)
	private String code;
	
	@Column(length=100,nullable=false)
	private String libelle;
	
	@Column(nullable=false)
	private int  obligatoire;

	public UniteEnseignement(Long id, String code, String libelle, int obligatoire) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.obligatoire = obligatoire;
	}

	public UniteEnseignement() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getObligatoire() {
		return obligatoire;
	}

	public void setObligatoire(int obligatoire) {
		this.obligatoire = obligatoire;
	}
	
	
	
}