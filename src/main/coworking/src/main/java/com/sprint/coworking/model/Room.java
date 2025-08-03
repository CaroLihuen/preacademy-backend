package com.sprint.coworking.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private int capacity;
    private String location;
    private boolean enabled;
    @OneToMany(mappedBy = "room_id")
    private List<Reservation> reservation;

    public Room(){}
}
