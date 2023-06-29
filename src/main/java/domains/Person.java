package domains;

import jakarta.persistence.*;

import java.lang.annotation.Inherited;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    private Long id;
    private String name;

}
