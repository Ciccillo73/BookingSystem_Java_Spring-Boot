package com.github.bookingSystem.bookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String town;

    @Column
    private int age;


}
