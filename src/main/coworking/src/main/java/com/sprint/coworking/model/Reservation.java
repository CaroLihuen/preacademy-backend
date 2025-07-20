package com.sprint.coworking.model;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;
    private Room room;
    private LocalDateTime starDateTime;
    private LocalDateTime endDateTime;
    private List viewings; 
    private ReservationStatus status;
    /*  Ver como funciona?
    @ManyToMany
    @JoinColumn(name = "nombre_union_tablas")*/

    public Reservation(){}
    

}
