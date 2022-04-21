package sk.stuba.fei.uim.oop.cviko.cviko2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Zviera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String druh;

    private String meno;

}
