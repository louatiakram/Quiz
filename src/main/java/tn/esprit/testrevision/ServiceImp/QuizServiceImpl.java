package tn.esprit.testrevision.ServiceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testrevision.Entity.Candidat;
import tn.esprit.testrevision.Entity.Quiz;
import tn.esprit.testrevision.Repository.CandidatRepository;
import tn.esprit.testrevision.Repository.QuizRepository;
import tn.esprit.testrevision.Service.IQuizService;

import java.time.LocalDate;

@Service
public class QuizServiceImpl implements IQuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private CandidatRepository candidatRepository;

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        // If date is not provided, set it to the current date
        if (quiz.getDateQuiz() == null) {
            quiz.setDateQuiz(LocalDate.now());
        }
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) {
        // Retrieve the quiz by its title
        Quiz quiz = quizRepository.findByTitreQuiz(titreQuiz);
        if (quiz == null) {
            throw new RuntimeException("Quiz not found");
        }

        // Retrieve the candidate by their ID
        Candidat candidat = candidatRepository.findById(idCandidat).orElseThrow(() -> new RuntimeException("Candidat not found"));

        // Add the quiz to the candidate
        candidat.getQuizs().add(quiz);

        // Increment the candidate's quiz count
        candidat.setNbQuiz(candidat.getNbQuiz() + 1);

        // Save the updated candidate
        candidatRepository.save(candidat);

        // Also save the quiz, as the relationship is Many-to-Many
        quizRepository.save(quiz);

        return quiz;
    }
}

