package org.example.repository;

import org.example.model.Country;

import static org.example.connection.EntityManagerProvider.entityManager;

public class CountryRepository {
    public Country add(Country country){
        entityManager.getTransaction().begin();
        entityManager.persist(country);
        entityManager.getTransaction().commit();
        return country;
    }
    public void delete(Country country){
        entityManager.getTransaction().begin();
        entityManager.remove(country);
        entityManager.getTransaction().commit();
    }
    public Country find(String name){
        return entityManager.find(Country.class, name);
    }
    public void update(Country country){
        entityManager.getTransaction().begin();
        entityManager.merge(country);
        entityManager.getTransaction().commit();
    }
}
