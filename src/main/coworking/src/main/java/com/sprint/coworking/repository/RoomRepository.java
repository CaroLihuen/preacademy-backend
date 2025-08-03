package com.sprint.coworking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.coworking.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    //ver que necesito
    Optional<Room> findBy(Long Id);
}