package org.example.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Repository {
    static EntityManager em;
    static{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        em = emf.createEntityManager();
    }
    public static EntityManager getEntityManager(){
        return em;
    }
}
