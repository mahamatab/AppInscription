package fr.pau.univ.inscription.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InscriptionUnitesOptionnelles
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "unitesOptionnellesId", nullable = false)
    private UniteEnseignement uniteEnseignement;

    @ManyToOne
    @JoinColumn(name = "inscriptionId", nullable = false)
    private Inscription inscription;

    public InscriptionUnitesOptionnelles(Long id, UniteEnseignement uniteEnseignement, Inscription inscription)
    {
        this.id = id;
        this.uniteEnseignement = uniteEnseignement;
        this.inscription = inscription;
    }

    public InscriptionUnitesOptionnelles()
    {

    }

    public Long getId()
    {
        return id;
    }

    public void setId(final Long theId)
    {
        id = theId;
    }

    public UniteEnseignement getUniteEnseignement()
    {
        return uniteEnseignement;
    }

    public void setUniteEnseignement(UniteEnseignement uniteEnseignement)
    {
        this.uniteEnseignement = uniteEnseignement;
    }

    public Inscription getInscription()
    {
        return inscription;
    }

    public void setInscription(Inscription inscription)
    {
        this.inscription = inscription;
    }

}
