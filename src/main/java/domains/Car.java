package domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Car {
    @Id
    private int id;
    private String model;
    private String make;
    private int year;
    private int mileage;

    @OneToOne
    private Driver driver;

    @OneToOne
    private Owner owner;

    public Car() {}
    public Car(int id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
