package fr.pau.univ.inscription.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
@Entity
public class DiplomeUnites implements Serializable {
	
	//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long unitesId;
	
	@ManyToOne
    @JoinColumn(name="diplomeId",nullable=false)
	private Diplome diplome;
	
	@OneToOne
    @JoinColumn(name="unitesId")
	@MapsId
    private UniteEnseignement uniteEnseignement;

	public DiplomeUnites(Long unitesId, Diplome diplome, UniteEnseignement uniteEnseignement) {
	
		this.unitesId = unitesId;
		this.diplome = diplome;
		this.uniteEnseignement = uniteEnseignement;
	}

	public DiplomeUnites() {
		
	}

	public Long getUnitesId() {
		return unitesId;
	}

	public void setUnitesId(Long unitesId) {
		this.unitesId = unitesId;
	}

	public Diplome getDiplome() {
		return diplome;
	}

	public void setDiplome(Diplome diplome) {
		this.diplome = diplome;
	}

	public UniteEnseignement getUniteEnseignement() {
		return uniteEnseignement;
	}

	public void setUniteEnseignement(UniteEnseignement uniteEnseignement) {
		this.uniteEnseignement = uniteEnseignement;
	}
	
	
}