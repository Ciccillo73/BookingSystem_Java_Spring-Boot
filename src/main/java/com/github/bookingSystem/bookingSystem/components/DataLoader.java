package com.github.bookingSystem.bookingSystem.components;

import com.github.bookingSystem.bookingSystem.models.Booking;
import com.github.bookingSystem.bookingSystem.models.Course;
import com.github.bookingSystem.bookingSystem.models.Customer;
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

    Customer antonio = new Customer("Antonio","Bari",32);

    Customer john = new Customer("John","Glasgow",40);
    Customer mark = new Customer("Mark","Edinburgh",25);
    Customer francesco = new Customer("Francesco","London",47);

        customerRepository.save(antonio);
        customerRepository.save(francesco);
        customerRepository.save(john);
        customerRepository.save(mark);



    Course java = new Course("Java", 4, "Glasgow");
    Course python = new Course("Python", 4, "Edinburgh");
    Course php = new Course("Php", 3, "London");
    Course js = new Course("Javascript", 4, "Glasgow");
    Course angular = new Course("Angular", 5, "Cambridge");

        courseRepository.save(java);
        courseRepository.save(python);
        courseRepository.save(php);
        courseRepository.save(js);
        courseRepository.save(angular);


    Booking booking1 = new Booking("12/05/2020", java, antonio );
    Booking booking2 = new Booking("02/02/2019", python, antonio );
    Booking booking3 = new Booking("03/03/2013", php, francesco );
    Booking booking4 = new Booking("04/04/2014", js, francesco );
    Booking booking5 = new Booking("05/05/2015", angular, mark );
    Booking booking6 = new Booking("06/06/2016", js, john );
    Booking booking7 = new Booking("12/05/2020", java, francesco );
    Booking booking8 = new Booking("12/05/2020", js, mark );
    Booking booking9 = new Booking("09/09/2019", php, antonio );
    Booking booking10 = new Booking("10/10/2020", js, antonio );


    bookingRepository.save(booking1);
    bookingRepository.save(booking2);
    bookingRepository.save(booking3);
    bookingRepository.save(booking4);
    bookingRepository.save(booking5);
    bookingRepository.save(booking6);
    bookingRepository.save(booking7);
    bookingRepository.save(booking8);
    bookingRepository.save(booking9);
    bookingRepository.save(booking10);



    }
}
