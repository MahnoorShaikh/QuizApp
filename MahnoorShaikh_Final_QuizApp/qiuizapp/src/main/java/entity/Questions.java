package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor

public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(columnDefinition = "TEXT")
    private String question;
    private int points;
    private String type;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Answer> choices;

    public Questions(Integer id, String question, int points, String type) {
        this.id = id;
        this.question = question;
        this.points = points;
        this.type = type;
    }
}

