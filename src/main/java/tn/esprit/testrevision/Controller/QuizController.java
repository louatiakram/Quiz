package tn.esprit.testrevision.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testrevision.Entity.Quiz;
import tn.esprit.testrevision.Service.IQuizService;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private IQuizService quizService;

    @PostMapping("/add")
    public Quiz ajouterQuiz(@RequestBody Quiz quiz) {
        return quizService.ajouterQuiz(quiz);
    }

    @PostMapping("/affecter/{titreQuiz}/{idCandidat}")
    public Quiz affecterQuizCandidat(@PathVariable String titreQuiz, @PathVariable Integer idCandidat) {
        return quizService.affecterQuizCandidat(titreQuiz, idCandidat);
    }
}

