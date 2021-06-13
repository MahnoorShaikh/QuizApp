package com.mahnoor.quizCreator.Repository;


import com.mahnoor.quizCreator.quizEnt.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz,Integer> {

}
