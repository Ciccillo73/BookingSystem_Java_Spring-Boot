package com.github.bookingSystem.bookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "bookings")

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String date;


    private Course course;

    private Customer customer;



}