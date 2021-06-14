package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String choice;
    private Boolean isCorrect;

    public Answer(Integer id, String choice, Boolean isCorrect) {
        this.id = id;
        this.choice = choice;
        this.isCorrect = isCorrect;
    }

}
