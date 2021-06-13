package com.mahnoor.quizCreator.Quiz_Controller;

import com.mahnoor.quizCreator.quizEnt.Quiz;
import com.mahnoor.quizCreator.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    QuizRepository q_Rep;
    @GetMapping(value = "/")
    public List<Quiz> total_data(){
        return (List<Quiz>) q_Rep.findAll();
    }

    @PostMapping(value = "/load")
    public List<Quiz> persist(@RequestBody Quiz quiz){
        q_Rep.save(quiz);
        return (List<Quiz>) q_Rep.findAll();
    }
}
