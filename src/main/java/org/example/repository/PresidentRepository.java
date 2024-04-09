package org.example.repository;

import org.example.model.President;
import static org.example.connection.EntityManagerProvider.entityManager;

public class PresidentRepository {
    public boolean add(President president){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(president);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public boolean delete(President president){
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(president);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public President find(String name){
        return entityManager.find(President.class, name);
    }
    public boolean update(President president){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(president);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
