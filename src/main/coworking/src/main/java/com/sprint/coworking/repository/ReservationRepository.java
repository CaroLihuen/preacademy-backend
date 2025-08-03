package com.sprint.coworking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.coworking.model.Reservation;
import com.sprint.coworking.model.User;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    //ver que necesito
    Optional<Reservation> findBy(Long Id);
    Optional<Reservation> findfindBy(User user);
}