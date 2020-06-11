package com.github.bookingSystem.bookingSystem.repositories;

import com.github.bookingSystem.bookingSystem.models.Course;
import com.github.bookingSystem.bookingSystem.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long> {

    List<Customer> findByBookingsCourseName(String name);
    List<Customer> findByTownAndBookingsCourseName(String town, String course);
    List<Customer> findByTownAndBookingsCourseNameAndAgeGreaterThan(String town, String course, int age);


}
