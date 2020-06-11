package com.github.bookingSystem.bookingSystem;

import com.github.bookingSystem.bookingSystem.models.Course;
import com.github.bookingSystem.bookingSystem.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canfindCourseByStarRating(){
		List<Course> foundCourse =  courseRepository.findByStarRating(4) ;
		assertEquals(3, foundCourse.size());
	}



}
