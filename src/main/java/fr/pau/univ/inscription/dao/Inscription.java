package fr.pau.univ.inscription.dao;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inscription implements Serializable {

	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=6,nullable=false)
	private String codePostale;
	
	@Column(length=50,nullable=false)
	private String commune;
	
	@Column(length=100,nullable=false)
	private String numeroEtVoie;
	
	@Column(length=50,nullable=false)
	private String pays;
	
	@Column(length=3,nullable=false)
	private String civilite;
	
	@Column(nullable=false)
	private Date dateDeNaissance; 
	
	@Column(length=100,nullable=false)
	private String nom;
	
	@Column(length=100,nullable=false)
	private String prenom;
	
	@Column(length=6,nullable=false)
	private String referenceDossier;
	
	@ManyToOne
    @JoinColumn(name="diplomeId",nullable=false)
    private Diplome diplome;
	

	public Inscription(Long id, String codePostale, String commune, String numeroEtVoie, String pays, String civilite,
			Date dateDeNaissance, String nom, String prenom, String referenceDossier, Diplome diplome) {
	
		this.id = id;
		this.codePostale = codePostale;
		this.commune = commune;
		this.numeroEtVoie = numeroEtVoie;
		this.pays = pays;
		this.civilite = civilite;
		this.dateDeNaissance = dateDeNaissance;
		this.nom = nom;
		this.prenom = prenom;
		this.referenceDossier = referenceDossier;
		this.diplome = diplome;
	}

	public Inscription() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getNumeroEtVoie() {
		return numeroEtVoie;
	}

	public void setNumeroEtVoie(String numeroEtVoie) {
		this.numeroEtVoie = numeroEtVoie;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getReferenceDossier() {
		return referenceDossier;
	}

	public void setReferenceDossier(String referenceDossier) {
		this.referenceDossier = referenceDossier;
	}

	public Diplome getDiplome() {
		return diplome;
	}

	public void setDiplome(Diplome diplome) {
		this.diplome = diplome;
	}

	
		
	
}