package LOREntities;
// Generated 19 avr. 2018 21:09:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tag generated by hbm2java
 */
public class Tag  implements java.io.Serializable {

     private Integer idTag;
     private String libelle;
     private Set jeus = new HashSet(0);

    public Tag() {
    }

	
    public Tag(String libelle) {
        this.libelle = libelle;
    }
    public Tag(String libelle, Set jeus) {
       this.libelle = libelle;
       this.jeus = jeus;
    }
   
    public Integer getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(Integer idTag) {
        this.idTag = idTag;
    }
    public String getLibelle() {
        return this.libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public Set getJeus() {
        return this.jeus;
    }
    
    public void setJeus(Set jeus) {
        this.jeus = jeus;
    }




}


