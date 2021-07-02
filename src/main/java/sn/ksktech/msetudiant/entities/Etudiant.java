package sn.ksktech.msetudiant.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Etudiant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String sexe;
    private String cni;
    private String numEtudiant;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String paysNaissance;
    //private String villeNaissance;
    private String lieuNaissance;
    private String nationalite;
    private Integer telephone;
    private  String email;
   /* private String serie;
    private String numTableBac;
    private Date anneeBac;*/





}
