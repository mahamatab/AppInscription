package fr.pau.univ.inscription.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity  /*permet de céer de entité*/
public class Diplome implements Serializable {
	
	
	public Diplome() {
	
	}

	public Diplome(Long id, String code, String descriptif, String enseignantResponsable, String libelle,
			TypeDiplome typeDiplome) {
		this.id = id;
		this.code = code;
		this.descriptif = descriptif;
		this.enseignantResponsable = enseignantResponsable;
		this.libelle = libelle;
		this.typeDiplome = typeDiplome;
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

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public String getEnseignantResponsable() {
		return enseignantResponsable;
	}

	public void setEnseignantResponsable(String enseignantResponsable) {
		this.enseignantResponsable = enseignantResponsable;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public TypeDiplome getTypeDiplome() {
		return typeDiplome;
	}

	public void setTypeDiplome(TypeDiplome typeDiplome) {
		this.typeDiplome = typeDiplome;
	}

/*	private static final long serialVersionUID = 1L;*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=6,nullable=false)
    private String code;

	@Column(length=4000)
    private String descriptif;

    private String enseignantResponsable;

    @Column(length=100,nullable=false)
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name="typeId",nullable=false)
    private TypeDiplome typeDiplome;
    


}
