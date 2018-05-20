package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import javax.persistence.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class CourseRelationalDb implements CourseDb {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public CourseRelationalDb(){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        entityManagerFactory = Persistence.createEntityManagerFactory("db");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void insert(Cours cours) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(cours);
        tx.commit();
    }

    @Override
    public void delete(int cours) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Query q = entityManager.createQuery("delete from Cours c where c.id = :name", Cours.class);
        q.setParameter("name", cours).executeUpdate();
        tx.commit();
    }

    @Override
    public void edit(Cours cours) {
        delete(cours.getId());
        insert(cours);
       /* Query q = entityManager.createQuery("UPDATE Cours c set c.name= :name, c.semester = :s, c.studyPoints = :sp where c.id = :id", Cours.class);
        entityManager.getTransaction().begin();
        q.setParameter("id", cours.getId());
        q.setParameter("name",cours.getName());
        q.setParameter("s",cours.getSemester());
        q.setParameter("sp",cours.getStudyPoints()).executeUpdate();
        entityManager.getTransaction().commit(); */
    }

    @Override
    public Cours getCours(int name) {
       Query q = entityManager.createQuery("Select c from Cours c where c.id = :name", Cours.class);
       return (Cours) q.setParameter("name",name).getSingleResult();
    }

    @Override
    public List<Cours> getCourses() {
        return entityManager.createQuery("Select c from Cours c", Cours.class).getResultList();
    }
}
