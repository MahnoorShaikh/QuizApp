package com.mahnoor.quizCreator.quizEnt;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor

public class Qxns {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition = "TEXT")
    private String question;
    private int points;
    private String type;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Ans> choices;

    public Qxns(int id, String question, int points, String type) {
        this.id = id;
        this.question = question;
        this.points = points;
        this.type = type;
    }
}
