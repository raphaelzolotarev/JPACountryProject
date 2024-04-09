package org.example.repository;

import org.example.model.Country;

import static org.example.connection.EntityManagerProvider.entityManager;

public class CountryRepository {
    public boolean add(Country country){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(country);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public boolean delete(Country country){
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(country);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public Country find(String name){
        return entityManager.find(Country.class, name);
    }
    public boolean update(Country country){
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(country);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
