package com.github.bookingSystem.bookingSystem.components;

import com.github.bookingSystem.bookingSystem.repositories.BookingRepository;
import com.github.bookingSystem.bookingSystem.repositories.CourseRepository;
import com.github.bookingSystem.bookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {



    }
}
