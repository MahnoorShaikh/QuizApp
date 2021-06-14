package entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private int points;
    private int timeDuration;
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Questions> questions;

    public Quiz(Integer id, String title, int points, int timeDuration, Date date) {
        this.id = id;
        this.title = title;
        this.points = points;
        this.timeDuration = timeDuration;
        this.date = date;
    }


}
