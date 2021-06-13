package com.mahnoor.quizCreator.quizEnt;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Ans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String choice;
    private Boolean isCorrect;

    public Ans(int id, String choice, Boolean isCorrect) {
        this.id = id;
        this.choice = choice;
        this.isCorrect = isCorrect;
    }

}
