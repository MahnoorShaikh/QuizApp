package repositories;

import entity.Answer;
import entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizReppository extends JpaRepository<Quiz, Integer> {
}
