package tn.esprit.testrevision.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidat;

    private String nom;

    private String prenom;

    private Integer nbQuiz;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @JsonIgnore
    @ManyToMany(mappedBy = "candidats")
    private Set<Quiz> quizs;
}

