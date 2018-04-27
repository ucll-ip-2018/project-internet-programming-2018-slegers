package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CourseRelationalDb implements CourseDb {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public CourseRelationalDb(){
        entityManagerFactory = Persistence.createEntityManagerFactory("ISTUDY");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void insert(Cours cours) {
        entityManager.getTransaction().begin();
        entityManager.persist(cours);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(int cours) {

    }

    @Override
    public void edit(Cours cours) {

    }

    @Override
    public Cours getCours(int name) {
        return null;
    }

    @Override
    public List<Cours> getCourses() {
        return entityManager.createQuery("Select c from Cours c", Cours.class).getResultList();
    }
}
