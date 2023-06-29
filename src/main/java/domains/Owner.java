package domains;

import jakarta.persistence.*;

import java.lang.annotation.Inherited;

@Entity
public class Owner extends Person {
    @Id
    private Long id;
    @OneToOne(mappedBy = "owner")
    private Car car;

    public Owner() {

    }

    public Owner(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", car=" + car +
                '}';
    }
}
