package main.segunda_evaluacion.src.main.java.sprint.segunda_evaluacion.model;

import main.segunda_evaluacion.src.main.java.sprint.segunda_evaluacion.utils.GeneradorID;

public class Profesional {
    private Long id;
    private String nombreCompleto;
    private String especialidad;

    public Profesional(String nombreCompleto, String especialidad){
        this.id = GeneradorID.generarProfesionalId();
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void SetNombreCompleto(String nuevoNombreCompleto){
        nombreCompleto = nuevoNombreCompleto;
    }

    public void SetEspecialidad(String nuevaEspecialidad){
        especialidad = nuevaEspecialidad;
    }
}
