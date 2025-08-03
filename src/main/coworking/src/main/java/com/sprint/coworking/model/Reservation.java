package com.sprint.coworking.model;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "room")
    private Room room;
    private LocalDateTime starDateTime;
    private LocalDateTime endDateTime;
    private List viewings;
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    public Reservation(){}
    

}
