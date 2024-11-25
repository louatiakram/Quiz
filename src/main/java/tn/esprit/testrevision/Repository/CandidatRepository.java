package tn.esprit.testrevision.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testrevision.Entity.Candidat;
import tn.esprit.testrevision.Entity.Niveau;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
    Set<Candidat> findByNiveauAndQuizsSpecialiteAndQuizsDateQuizAfter(Niveau niveau, String specialite, LocalDate date);
}
