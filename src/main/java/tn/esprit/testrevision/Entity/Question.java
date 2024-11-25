package tn.esprit.testrevision.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQuestion;

    private String libelleQ;

    @Enumerated(EnumType.STRING)
    private Complexite complexite;

    @ManyToOne
    private Quiz quiz;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reponse> reponses;
}

