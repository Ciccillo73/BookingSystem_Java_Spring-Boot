package com.github.bookingSystem.bookingSystem.repositories;

import com.github.bookingSystem.bookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long>{




}
