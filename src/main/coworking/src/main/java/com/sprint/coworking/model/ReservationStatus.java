package com.sprint.coworking.model;

/*Averiguar como se declaran los Enum */
public enum ReservationStatus {
    ACTIVE("Reserva Activa"),
    CANCELLED("Reserva Cancelada");

    private String description;

    ReservationStatus(String description){
       this.description = description;
    }

    public String getDescription(){
        return description;
    }
}