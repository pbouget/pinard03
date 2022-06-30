package fr.bouget.jpa.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author Philippe
 * Classe de clef composée de l'entity Vin
 * Attention, ceci n'est pas une Entity,
 * mais juste une classe basique.
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class VinPK implements Serializable {
    public static final long serialVersionUID=56439876525L;
    
    private Integer codeProduit;
    private String designation;
	
    public VinPK(){
       this(0,null);
    } 
	
    public VinPK(Integer codeProduit, String designation)
    {
        this.codeProduit=codeProduit;
        this.designation=designation;
    }
}
