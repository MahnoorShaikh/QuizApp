package com.mahnoor.quizCreator.Repository;


import com.mahnoor.quizCreator.quizEnt.Ans;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Ans, Integer> {
}

