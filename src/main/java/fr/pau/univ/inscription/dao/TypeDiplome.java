package fr.pau.univ.inscription.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeDiplome implements Serializable
{
    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String libelle;

    public TypeDiplome()
    {
    }

    public TypeDiplome(final Long theId, final String theLibelle)
    {
        id = theId;
        libelle = theLibelle;
    }

    /**
     * Accesseur de {@link #id}.
     *
     * @return la valeur de id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Mutateur de {@link #id}.
     *
     * @param theId le id à affecter
     */
    public void setId(final Long theId)
    {
        id = theId;
    }

    /**
     * Accesseur de {@link #libelle}.
     *
     * @return la valeur de libelle
     */
    public String getLibelle()
    {
        return libelle;
    }

    /**
     * Mutateur de {@link #libelle}.
     *
     * @param theLibelle le libelle à affecter
     */
    public void setLibelle(final String theLibelle)
    {
        libelle = theLibelle;
    }
}
