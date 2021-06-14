package controller;

import entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.QuizReppository;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizReppository quizReppository;

    @GetMapping(value = "/getAll")
    public List<Quiz> getAll() {
        return quizReppository.findAll();
    }

    @PostMapping( "/load")
    public Quiz saveQuiz(@RequestBody Quiz quiz) {
        return quizReppository.save(quiz);
    }
}
