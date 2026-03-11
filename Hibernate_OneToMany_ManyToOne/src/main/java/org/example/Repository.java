package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Repository {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
