package main.primera_evaluacion.model;

public class Usuario {
    public Integer id;
    public String nombreUsuario;
    public String contraseña;
    //utilizar wrappers
    /*Atributos: id, nombreUsuario, contraseña (utilizar wrappers).*/ 
 
    public Usuario(Integer newId, String newNombreU, String newContraseña){
        this.id = newId;
        this.nombreUsuario = newNombreU;
        this.contraseña = newContraseña;
    }

    public Integer getId(){
        return id;
    }

    public String getNombreU(){
        return nombreUsuario; 
    }
    
    public String getContraseña(){
        return contraseña;
    }

    public void SetId(Integer newId){
        id = newId;
    }

    public void SetNombreU(String newNombreU){
        nombreUsuario = newNombreU;
    }

    public void SetContraseña(String newContraseña){
        contraseña = newContraseña;
    }
}
