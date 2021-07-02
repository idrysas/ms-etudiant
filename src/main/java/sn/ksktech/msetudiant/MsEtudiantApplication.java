package sn.ksktech.msetudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import sn.ksktech.msetudiant.dao.EtudiantRepository;
import sn.ksktech.msetudiant.entities.Etudiant;
import sn.ksktech.msetudiant.entities.EtudiantProjection;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class MsEtudiantApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;

   // private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(MsEtudiantApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {



        etudiantRepository.save(new Etudiant(null,"sarr","idrissa","M",
            "119400222","2021BM7",new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-01"),"Senegal"
            ,"keursambakane",
            "senegalaise",767570242,"sarridyksk@gmail.com"));
        etudiantRepository.save(new Etudiant(null,"fall","goumballa","M",
            "119403332","2021AS7",new SimpleDateFormat("yyyy-MM-dd").parse("2000-05-01"),
            "USA"
            ,"keursambakane",
            "senegalaise",780570242,"sgoumballa@gmail.com"));
        etudiantRepository.save(new Etudiant(null,"diop","mariama","F",
            "119403332","2020NK7",new SimpleDateFormat("yyyy-MM-dd").parse("2008-06-01"),
            "Senegal"
            ,"keursambakane",
            "senegalaise",78930242,"mariama@gmail.com"));

        etudiantRepository.findAll().forEach(e -> {
            System.out.println(e.toString());
        } );

    }
}
