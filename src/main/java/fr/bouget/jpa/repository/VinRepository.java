package fr.bouget.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bouget.jpa.model.Vin;
import fr.bouget.jpa.model.VinPK;

/**
 * @author Philippe
 * Remarque : la nature de la clef change, ce n'est plus Integer
 * mais VinPK (la classe de la clef composée)
 *
 */
@Repository
public interface VinRepository extends JpaRepository<Vin, VinPK> {

}
