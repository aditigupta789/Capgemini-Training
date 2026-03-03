package org.example.oneToOne;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Person1 {
    @Id
    private int id;
    private String name;
    private int age;

    @OneToOne
    private Pan pan;

    @Override
    public String toString() {
        return "Person1{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}