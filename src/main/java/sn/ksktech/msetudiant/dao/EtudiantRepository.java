package sn.ksktech.msetudiant.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import sn.ksktech.msetudiant.entities.Etudiant;

import java.util.List;

    @CrossOrigin("*")
    @RepositoryRestController
    public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    @RestResource(path = "/byNom")
    public List<Etudiant> findByNomContains(@Param("mc") String des);

    @RestResource(path = "/byNomPage")
    public Page<Etudiant> findByNomContains(@Param("mc") String des, Pageable peageable);




}
