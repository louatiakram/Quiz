package tn.esprit.testrevision.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testrevision.Entity.Candidat;
import tn.esprit.testrevision.Service.ICandidatService;

@RestController
@RequestMapping("/api/candidats")
public class CandidatController {

    @Autowired
    private ICandidatService candidatService;

    @PostMapping("/add")
    public Candidat ajouterCandidat(@RequestBody Candidat candidat) {
        return candidatService.ajouterCandidat(candidat);
    }
}

