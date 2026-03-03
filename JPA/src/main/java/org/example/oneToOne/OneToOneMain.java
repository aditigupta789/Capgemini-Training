package org.example.oneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class OneToOneMain {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setId(78);
        p1.setAge(67);
        p1.setName("Adam");

        Pan p = new Pan();
        p.setPanAddress("up");

        p1.setPan(p);
        p.setPerson(p1);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(p1);
        em.persist(p);
        tx.commit();
        em.close();
        emf.close();
    }
}
