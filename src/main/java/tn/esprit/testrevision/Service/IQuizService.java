package tn.esprit.testrevision.Service;

import tn.esprit.testrevision.Entity.Quiz;

public interface IQuizService {
    Quiz ajouterQuiz(Quiz quiz);
    Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat);
}
