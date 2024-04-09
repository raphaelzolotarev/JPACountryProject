package org.example.repository;

import org.example.model.President;
import static org.example.connection.EntityManagerProvider.entityManager;

public class PresidentRepository {
    public President add(President president){
        entityManager.getTransaction().begin();
        entityManager.persist(president);
        entityManager.getTransaction().commit();
        return president;
    }
    public void delete(President president){
        entityManager.getTransaction().begin();
        entityManager.remove(president);
        entityManager.getTransaction().commit();
    }
    public President find(String name){
        return entityManager.find(President.class, name);
    }
    public void update(President president){
        entityManager.getTransaction().begin();
        entityManager.merge(president);
        entityManager.getTransaction().commit();
    }
}
