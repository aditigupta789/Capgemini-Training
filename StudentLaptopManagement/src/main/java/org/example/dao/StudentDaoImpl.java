package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.entity.Laptop;
import org.example.entity.Student1;
import org.example.repository.Repository;

public class StudentDaoImpl implements StudentDAO {

    static EntityManager em;
    static EntityTransaction tx;

    static {
        em = Repository.getEntityManager();
        tx = em.getTransaction();
    }

    @Override
    public void saveData(Student1 student, Laptop laptop) {

        Student1 student1 = em.find(Student1.class, student.getId());
        if (student1 != null) {
            throw new RuntimeException("Student already exists");
        }

        Laptop laptop1 = em.find(Laptop.class, laptop.getId());
        if (laptop1 != null) {
            throw new RuntimeException("Laptop already exists");
        }

        student.setLaptop(laptop);
        laptop.setStudent(student);

        tx.begin();
        em.persist(laptop);
        em.persist(student);
        tx.commit();

        System.out.println("Student data is successfully");
    }

    @Override
    public void fetchLaptopFromStudent(int studentID) {

        tx.begin();
        Student1 student = em.find(Student1.class, studentID);

        if (student != null) {
            Laptop laptop = student.getLaptop();

            if (laptop != null) {
                System.out.println("laptopId : " + laptop.getId());
                System.out.println("laptop brand : " + laptop.getBrand());
                System.out.println("laptop price : " + laptop.getPrice());
            } else {
                System.out.println("no laptop found");
            }

        } else {
            System.out.println("Student not found");
        }

        tx.commit();
    }

    @Override
    public void fetchStudentFromLaptop(int laptopID) {

        tx.begin();
        Laptop laptop = em.find(Laptop.class, laptopID);

        if (laptop != null) {
            Student1 student = laptop.getStudent();

            if (student != null) {
                System.out.println(student);
            } else {
                System.out.println("NO student not found");
            }

        } else {
            System.out.println("Laptop not found");
        }

        tx.commit();
    }

    @Override
    public void updateLaptopBrand(int laptopID, String newBrand) {

        tx.begin();
        Laptop laptop = em.find(Laptop.class, laptopID);

        if (laptop != null) {
            laptop.setBrand(newBrand);
            em.merge(laptop);
            System.out.println("Laptop Brand updated successfully");
        } else {
            System.out.println("Laptop not found");
        }

        tx.commit();
    }

    @Override
    public void updateStudentCourse(int studentID, String newCourse) {

        tx.begin();
        Student1 student = em.find(Student1.class, studentID);

        if (student != null) {
            student.setCourse(newCourse);
            em.merge(student);
        } else {
            System.out.println("Student not found");
        }

        tx.commit();
    }

    /*
    for changing laptops for student we need to create new laptop
    then set that laptop for the student
    and remove the old laptop id from the laptop table to avoid inconsistencies in the database
     */
    @Override
    public void changeLaptopForStudent(int studentID, int laptopID) {

        tx.begin();

        Student1 student = em.find(Student1.class, studentID);
        if (student == null) {
            System.out.println("Student not found");
            tx.commit();
            return;
        }

        Laptop newLaptop = em.find(Laptop.class, laptopID);
        if (newLaptop == null) {
            System.out.println("Laptop not found");
            tx.commit();
            return;
        }

        Laptop oldLaptop = student.getLaptop();

        if (oldLaptop != null) {
            oldLaptop.setStudent(null);
            student.setLaptop(null);
            em.remove(oldLaptop);
        }

        student.setLaptop(newLaptop);
        newLaptop.setStudent(student);

        tx.commit();

        System.out.println("Laptop updated successfully");
    }

    @Override
    public void removeLaptopFromStudent(int studentID) {

        tx.begin();

        Student1 student = em.find(Student1.class, studentID);

        if (student == null) {
            System.out.println("Student not found");
            tx.commit();
            return;
        }

        Laptop laptop = student.getLaptop();

        if (laptop != null) {
            laptop.setStudent(null);
            student.setLaptop(null);
            em.remove(laptop);
        } else {
            System.out.println("Laptop not found");
        }

        tx.commit();
    }

    @Override
    public void deleteStudentFromLaptop(int laptopID) {

        tx.begin();

        Laptop laptop = em.find(Laptop.class, laptopID);

        if (laptop != null) {
            Student1 student = laptop.getStudent();

            if (student != null) {
                student.setLaptop(null);
                em.remove(student);
            } else {
                System.out.println("no student is assigned by this laptop id");
            }

        } else {
            System.out.println("Laptop not found");
        }

        tx.commit();
    }
}