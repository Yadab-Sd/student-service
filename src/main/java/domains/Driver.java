package domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Driver extends Person {
    @Id
    private Long id;

    public Driver() {

    }

    public Driver(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                '}';
    }
}
