package sn.ksktech.msetudiant.service;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.*;
import sn.ksktech.msetudiant.dao.EtudiantRepository;
import sn.ksktech.msetudiant.entities.Etudiant;

import java.awt.*;
import java.util.List;

@RestController
public class EtudiantRestService {

    @Autowired

    private EtudiantRepository etudiantRepository;
    @GetMapping(value="/listEtudiants")
    public List<Etudiant> listEtudiants(){

        return etudiantRepository.findAll();
    }

    @GetMapping(value = "/listEtudiants/{id}")
    public Etudiant listEtudiants(@PathVariable(name = "id") Long id){

        return etudiantRepository.findById(id).get();
    }

    @PutMapping (value="/listEtudiants/{id}")
    public Etudiant update(@PathVariable(name = "id") Long id,@RequestBody Etudiant e){
        e.setId(id);
        return etudiantRepository.save(e);
    }
    @PostMapping(value = "/listEtudiants")
    public Etudiant save(@RequestBody Etudiant e){
        return etudiantRepository.save(e);
    }
    @DeleteMapping(value = "/listEtudiants/{id}")
    public void delete(@PathVariable (name = "id") Long id){

       etudiantRepository.deleteById(id);
    }

}
