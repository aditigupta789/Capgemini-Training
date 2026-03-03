package org.example.dao;

import org.example.entity.Laptop;
import org.example.entity.Student1;

public interface StudentDAO {
    void saveData(Student1 student, Laptop laptop);

    void fetchLaptopFromStudent(int studentID);
    void fetchStudentFromLaptop(int laptopID);

    void updateLaptopBrand(int laptopID, String newBrand);

    void updateStudentCourse(int studentID, String newCourse);

    void changeLaptopForStudent(int studentID, int laptopID);

    void removeLaptopFromStudent(int studentID);

    void deleteStudentFromLaptop(int laptopID);
}
