package tn.esprit.testrevision.ServiceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testrevision.Entity.Quiz;
import tn.esprit.testrevision.Repository.QuizRepository;
import tn.esprit.testrevision.Service.IQuizService;

import java.time.LocalDate;

@Service
public class QuizServiceImpl implements IQuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        // If date is not provided, set it to the current date
        if (quiz.getDateQuiz() == null) {
            quiz.setDateQuiz(LocalDate.now());
        }
        return quizRepository.save(quiz);
    }
}

