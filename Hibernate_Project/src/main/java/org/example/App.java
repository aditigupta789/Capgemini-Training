package org.example;

import org.example.dao.StudentDAO;
import org.example.dao.StudentDAOImpl;
import org.example.entity.Student;

import java.util.List;

public class App {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOImpl();


        // 1. SAVE students
        Student s1 = Student.builder()
                .name("Aditi")
                .department("CSE")
                .age(22)
                .marks(92)
                .build();

        Student s2 = Student.builder()
                .name("Neha")
                .department("IT")
                .age(23)
                .marks(85)
                .build();

        Student s3 = Student.builder()
                .name("Riya")
                .department("CSE")
                .age(21)
                .marks(95)
                .build();

        dao.save(s1);
        dao.save(s2);
        dao.save(s3);

        System.out.println("Students saved\n");


        // 2. FETCH ALL
        System.out.println("All Students:");
        List<Student> all = dao.fetchAll();
        all.forEach(System.out::println);


        // 3. FETCH BY ID
        System.out.println("\nFetch student with ID 1:");
        Student student = dao.fetchById(1);
        System.out.println(student);


        // 4. UPDATE MARKS (HQL)
        dao.updateMarks(1, 98);
        System.out.println("\nUpdated marks for ID 1:");
        System.out.println(dao.fetchById(1));


        // 5. SORT BY MARKS
        System.out.println("\nSorted by Marks:");
        dao.sortByMarks().forEach(System.out::println);


        // 6. SORT BY AGE DESC
        System.out.println("\nSorted by Age Desc:");
        dao.sortByAgeDesc().forEach(System.out::println);


        // 7. FILTER BY DEPARTMENT
        System.out.println("\nFilter by Department = CSE:");
        dao.filterByDept("CSE").forEach(System.out::println);


        // 8. NATIVE FETCH
        System.out.println("\nNative Fetch:");
        dao.nativeFetch().forEach(System.out::println);


        // 9. NATIVE UPDATE
        dao.nativeUpdateMarks(2, 88);
        System.out.println("\nAfter Native Update:");
        System.out.println(dao.fetchById(2));


        // 10. DELETE
        dao.delete(3);
        System.out.println("\nAfter deleting ID 3:");
        dao.fetchAll().forEach(System.out::println);
    }
}
