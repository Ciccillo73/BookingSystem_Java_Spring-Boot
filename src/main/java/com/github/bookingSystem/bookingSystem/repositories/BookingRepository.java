package com.github.bookingSystem.bookingSystem.repositories;

import com.github.bookingSystem.bookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository <Booking, Long> {




}
