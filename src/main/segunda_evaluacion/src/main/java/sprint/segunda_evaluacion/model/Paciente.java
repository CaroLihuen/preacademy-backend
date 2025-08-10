package sprint.segunda_evaluacion.model;

import sprint.segunda_evaluacion.utils.GeneradorID;

public class Paciente {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;

    public Paciente(String nombre, String apellido, String dni, String email){
        this.id = GeneradorID.generarPacienteId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getEmail(){
        return email;
    }

    public void SetNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void SetApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }

    public void SetDni(String nuevoDni){
        dni = nuevoDni;
    }

    public void SetEmail(String nuevoEmail){
        email = nuevoEmail;
    }
    
}
