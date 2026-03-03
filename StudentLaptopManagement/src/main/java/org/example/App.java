package org.example;

import org.example.dao.StudentDAO;
import org.example.dao.StudentDaoImpl;
import org.example.entity.Laptop;
import org.example.entity.Student1;

public class App {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDaoImpl();

        // -------------------------------
        // saveData
        // -------------------------------
        Student1 s1 = new Student1();
        s1.setName("Aditi");
        s1.setCourse("B.Tech");

        Laptop l1 = new Laptop();
        l1.setBrand("Dell");
        l1.setPrice(75000);

        dao.saveData(s1, l1);

        // -------------------------------
        // fetchLaptopFromStudent
        // -------------------------------
        dao.fetchLaptopFromStudent(7);

        // -------------------------------
        // fetchStudentFromLaptop
        // -------------------------------
        dao.fetchStudentFromLaptop(4);

        // -------------------------------
        // updateLaptopBrand
        // -------------------------------
        dao.updateLaptopBrand(1, "HP");

        // -------------------------------
        //updateStudentCourse
        // -------------------------------
        dao.updateStudentCourse(1, "MCA");

        // verify updates
        dao.fetchLaptopFromStudent(1);

        // -------------------------------
        //  create second laptop
        // -------------------------------
        Student1 temp = new Student1();
        temp.setName("Temp");
        temp.setCourse("TempCourse");

        Laptop l2 = new Laptop();
        l2.setBrand("Lenovo");
        l2.setPrice(85000);

        dao.saveData(temp, l2);

        // free laptop 2 from temp student (only relation break, laptop delete)
        dao.removeLaptopFromStudent(2);

        // -------------------------------
        //  changeLaptopForStudent
        // -------------------------------
        dao.changeLaptopForStudent(1, 2);

        // verify change
        dao.fetchLaptopFromStudent(1);

        // -------------------------------
        //  removeLaptopFromStudent
        // -------------------------------
        dao.removeLaptopFromStudent(1);

        dao.fetchLaptopFromStudent(1);

        // -------------------------------
        // deleteStudentFromLaptop
        // -------------------------------
        // first create again for testing
        Student1 s3 = new Student1();
        s3.setName("Test");
        s3.setCourse("TestCourse");

        Laptop l3 = new Laptop();
        l3.setBrand("Asus");
        l3.setPrice(65000);

        dao.saveData(s3, l3);

        dao.deleteStudentFromLaptop(3);

        System.out.println("All DAO methods executed.");
    }
}