package tn.esprit.testrevision.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testrevision.Entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    // You can add custom query methods here if needed
}

