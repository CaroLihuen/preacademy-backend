package main.electrodomestic.models;

public class Electrodomestico {
    private String nombre;
    private double precioBase;
    private String color;
    private double consumoEnergetico;
    private double peso; 

    public Electrodomestico(String nuevoNombre, double nuevoPrecio, String nuevoColor, double consumo, double nuevoPeso){
        this.nombre= nuevoNombre;
        this.precioBase= nuevoPrecio;
        this.color= nuevoColor;
        this.consumoEnergetico= consumo;
        this.peso= nuevoPeso;
    }

    public Electrodomestico(String nuevoNombre){
        this.nombre= nuevoNombre;
        this.precioBase= 100;
        this.color= "gris plata";
        this.consumoEnergetico= 10;
        this.peso= 2;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecioBase(){
        return precioBase;
    }

    public String getColor(){
        return color;
    }

    public double getConsumoEnergetico(){
        return consumoEnergetico;
    }

    public double getPeso(){
        return peso;
    }

    public void SetNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void SetPrecioBase(double nuevoPrecioBase){
        precioBase = nuevoPrecioBase;
    }

    public void SetColor(String nuevoColor){
        color = nuevoColor;
    }

    public void SetConsumoEnergetico(double nuevoConsumo){
        consumoEnergetico = nuevoConsumo;
    }

    public void SetPeso(double nuevoPeso){
        peso = nuevoPeso;
    }

    
}
