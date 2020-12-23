package fr.pau.univ.inscription.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TypeDiplomeRepository extends JpaRepository<TypeDiplome, Long>{

}
