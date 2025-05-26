package main.primera_evaluacion.model;

public class Cliente extends Usuario {
    // Hereda de Usuario. Agrega atributo nombreCompleto.
    public String nombreCompleto;

    public Cliente(Integer id, String nombreUsuario, String contraseña, String nombreCompleto) {
        super(id, nombreUsuario, contraseña);
        this.nombreCompleto = nombreCompleto;
    }

}
