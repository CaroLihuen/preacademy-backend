package com.sprint.coworking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.coworking.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    //ver que necesito
    Optional<User> findBy(Long Id);
}