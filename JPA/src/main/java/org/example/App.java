package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.oneToOne.Pan;
import org.example.oneToOne.Person1;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

//        //------------------------save------------------------------------
//        Person1 p1 = new Person1();
//        p1.setId(11);
//        p1.setName("Juan");
//        p1.setAge(30);
//
//        em.persist(p1);
//        tx.commit();
//
//        System.out.println("data added succesffylly");

//        --------------------------fetch----------------------------------
//        Person1 p1 = em.find(Person1.class, 11);
//        System.out.println(p1);
//
//        //fetching all
//        List<Person1> list = em.createQuery("from Person1", Person1.class).getResultList();
//        for (Person1 p : list) {
//            System.out.println(p);
//        }

        //-------------------------update-----------------------------
//        Person1 p1 = em.find(Person1.class, 11);
//        p1.setAge(45);
//        em.merge(p1);
//        tx.commit();
//
//        System.out.println(p1);

        //------------------------------delete---------------------------
//        Person1 p1 = em.find(Person1.class, 11);
//        em.remove(p1);
//        tx.commit();

        //---------------------------mapping-------------------------------
        //one to one mapping
        //one to many mapping
        //many to one mapping
        //many to many mapping

        em.close();
        emf.close();
    }
}
