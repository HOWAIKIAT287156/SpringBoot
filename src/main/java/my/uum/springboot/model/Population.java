package my.uum.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "population_state")
public class Population {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "State")
    private String State;

    @Column(name = "Date")
    private String Date;

    @Column(name = "Sex")
    private String Sex;

    @Column(name = "Age")
    private String Age;

    @Column(name = "Ethnicity")
    private String Ethnicity;

    @Column(name = "Population")
    private int Population;
}
