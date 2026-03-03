package org.example.repository;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentRepository {

    private static final SessionFactory sessionFactory;

    // static block runs once when class loads
    static {

        Configuration configuration =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Student.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    // method to get session
    public static Session getSession() {

        return sessionFactory.openSession();
    }
}
