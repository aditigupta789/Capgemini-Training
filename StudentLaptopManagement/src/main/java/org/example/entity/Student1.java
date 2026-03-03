package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String course;

    @OneToOne
    private Laptop laptop;

    @Override
    public String toString() {
        System.out.println("id: " + id +
                " name: " + name +
                " course: " + course +
                "laptopId : " + laptop.getId());
        return null;
    }
}
