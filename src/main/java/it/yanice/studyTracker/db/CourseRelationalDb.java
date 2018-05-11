package it.yanice.studyTracker.db;

import it.yanice.studyTracker.domain.Cours;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
        Query q = entityManager.createQuery("delete from Cours c where c.id = :name", Cours.class);
        q.setParameter("name", cours).executeUpdate();
    }

    @Override
    public void edit(Cours cours) {
        //TODO
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
