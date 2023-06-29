import domains.Course;
import domains.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        Student student = new Student(124L, "Jack", 3.9);
        Course course = new Course(111L, "EA", 25);
        student.setCourse(course);
        em.persist(course);
        em.persist(student);
        etx.commit();
        em.close();
        emf.close();
    }
}
