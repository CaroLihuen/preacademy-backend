package main.primera_evaluacion.model;

/*Atributos: int id, String nombre, double precio, String categoría.
Implementar constructor vacío, getters y setters.
Sobrescribir el método toString.
Incluir patrón Builder dentro de la misma clase (lo que explicamos en la mentoría, como alternativa a los constructores).
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(){

    }
    
    public Producto iD(int id){
        this.id = id;
        return this;
    }

    public Producto nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public Producto precio(double precio){
        this.precio = precio;
        return this;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio; 
    }

    public String getCategoria(){
        return categoria;
    }

    public Producto categoria(String categoria){
        this.categoria = categoria;
        return this;
    }
    
    @Override
    public String toString(){
        return " ID: " + this.id 
        + ", Nombre: " + this.nombre 
        + ", Precio: "+ this.precio 
        + ", Categoría: "+ this.categoria;
    }  
}
