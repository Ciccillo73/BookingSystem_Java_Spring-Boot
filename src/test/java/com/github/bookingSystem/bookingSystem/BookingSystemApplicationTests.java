package com.github.bookingSystem.bookingSystem;

import com.github.bookingSystem.bookingSystem.models.Booking;
import com.github.bookingSystem.bookingSystem.models.Course;
import com.github.bookingSystem.bookingSystem.models.Customer;
import com.github.bookingSystem.bookingSystem.repositories.BookingRepository;
import com.github.bookingSystem.bookingSystem.repositories.CourseRepository;
import com.github.bookingSystem.bookingSystem.repositories.CustomerRepository;
import com.sun.java.accessibility.util.EventID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canfindCourseByStarRating(){
		List<Course> foundCourse =  courseRepository.findByStarRating(4) ;
		assertEquals(3, foundCourse.size());
	}

	@Test
	public void canFindCustomerByCourseName(){
		List<Customer> foundCustomer = customerRepository.findByBookingsCourseName("Java");
		assertEquals(2, foundCustomer.size());

	}

	@Test
	public void	canFindCourseByCustomerId(){
		List<Course> foundCourse = courseRepository.findByBookingsCustomerId(1L);
			assertEquals(4, foundCourse.size());

	}

	@Test
	public void	 canFindBookingByDate(){
		List<Booking> foundBooking = bookingRepository.findByDate("12/05/2020");
		assertEquals(3, foundBooking.size());
	}

	@Test
	public void	canFindCustomerTownAndBookingCourseName(){
		List<Customer> foundCustomer = customerRepository.findByTownAndBookingsCourseName("London", "Javascript");
			assertEquals(2, foundCustomer.size());


	}

}
