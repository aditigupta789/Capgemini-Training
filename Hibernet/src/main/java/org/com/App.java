package org.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {

    public static void main(String[] args) {

        // load configuration
        Configuration configuration = new Configuration();
        configuration.configure(); // loads hibernate.cfg.xml
        configuration.addAnnotatedClass(Person1.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // ---------------- INSERT ----------------
        /*
        Person1 pr = new Person1();
        pr.setId(3);
        pr.setName("Aditi");
        pr.setAge(23);

        session.persist(pr);
        */

        // ---------------- FETCH ----------------
        Person1 p = session.get(Person1.class, 1);
        System.out.println("Fetched: " + p);

        // ---------------- UPDATE ----------------
        if (p != null) {
            p.setName("Drake");
            session.merge(p);
        }

        // ---------------- DELETE ----------------
        /*
        if (p != null) {
            session.remove(p);
        }
        */

        // ---------------- FETCH ALL ----------------
        List<Person1> list =
                session.createQuery("from Person1", Person1.class).list();

        System.out.println("All persons:");
        for (Person1 person : list) {
            System.out.println(person);
        }

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}