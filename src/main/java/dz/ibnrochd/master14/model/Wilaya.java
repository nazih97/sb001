package dz.ibnrochd.master14.model;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Wilaya {
    private int id;
    private boolean actif;
    private int compteCreation;
    private Integer compteMaj; 
    private Timestamp dateCreation;
    private Timestamp dateMaj;
    private String nomArabe;
    private String nomLatin;
    private String nomTamazight;
    
}