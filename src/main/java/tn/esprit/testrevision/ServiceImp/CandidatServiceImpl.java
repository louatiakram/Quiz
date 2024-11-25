package tn.esprit.testrevision.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testrevision.Entity.Candidat;
import tn.esprit.testrevision.Repository.CandidatRepository;
import tn.esprit.testrevision.Service.ICandidatService;

@Service
public class CandidatServiceImpl implements ICandidatService {

    @Autowired
    private CandidatRepository candidatRepository;

    @Override
    public Candidat ajouterCandidat(Candidat candidat) {
        // Initialize `nbQuiz` to 0 if not provided
        if (candidat.getNbQuiz() == null) {
            candidat.setNbQuiz(0);
        }
        return candidatRepository.save(candidat);
    }
}
