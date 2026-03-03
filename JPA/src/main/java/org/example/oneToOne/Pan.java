package org.example.oneToOne;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Pan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int panNumber;

    @Column(nullable = false)
    private String panAddress;

    //inverse side of person1
    //we are telling compiler that table will be made on the other class of person1 will be the foreign key of pan
    //one to one mapping
    //pan table is not holding the person details
    @OneToOne (mappedBy = "pan")
    private Person1 person;
}
