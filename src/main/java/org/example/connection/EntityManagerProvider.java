package org.example.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static EntityManagerFactory emf;
    public static EntityManager entityManager;
    public EntityManagerProvider(){
        this.emf = Persistence.createEntityManagerFactory("database-configuration");
        this.entityManager = this.emf.createEntityManager();
    }
    public EntityManagerProvider(String pu){
        this.emf = Persistence.createEntityManagerFactory(pu);
        this.entityManager = this.emf.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public static void closeConnection(){
        emf.close();
        entityManager.close();
    }
}
