package domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Course {
    @Id
    private Long id;
    private String title;
    private int capacity;

    @OneToMany(mappedBy = "course")
    private List<Student> students;

    public Course() {
    }

    public Course(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Course(Long id, String title, int capacity) {
        this.id = id;
        this.title = title;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}
