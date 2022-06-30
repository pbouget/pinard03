package fr.bouget.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@IdClass(VinPK.class)
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Vin implements Serializable {
    public static final long serialVersionUID=56439876525L;

    @Id
    private Integer codeProduit;
    
    @Id
    @Column(length = 50)
    private String designation;
    
    @Column(length = 45)
    private String region;
    
    public enum choix {ROUGE,BLANC,ROSE};
    
    @Enumerated(value = EnumType.STRING)
    @Column(length = 5)    
    private choix couleur;
    
    @Column(precision = 3, scale = 2)
    private double prix;
    
    @Column(precision = 2, scale = 2)
    private double remise;
    
    @Column(length = 3)
    private int quantite;
}
