package sn.ksktech.msetudiant.entities;

import org.springframework.data.rest.core.config.Projection;

import javax.xml.crypto.Data;

@Projection(name="P1",types = Etudiant.class)
public interface EtudiantProjection {

    public String getPaysNaissance();

    //public  String getEmail();


}
