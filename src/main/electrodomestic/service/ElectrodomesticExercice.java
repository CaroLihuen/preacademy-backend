package main.electrodomestic.service;

import main.electrodomestic.models.Electrodomestico;

public class ElectrodomesticExercice {
    public static void main(String[] args) {

        // En este ejercicio vas a trabajar con atributos por defecto, constructores,
        // encapsulamiento y métodos que procesan información del objeto.

        // CONSIGNA 1:
        // Crear una clase llamada Electrodomestico en este mismo proyecto.

        // CONSIGNA 2:
        // Definir los siguientes atributos:
        // - nombre
        // - precio base
        // - color
        // - consumo energético
        // - peso

        // CONSIGNA 3:
        // Asignar los siguientes valores por defecto:
        // - color por defecto: gris plata
        // - consumo energético por defecto: 10
        // - precio base por defecto: 100
        // - peso por defecto: 2

        // CONSIGNA 4:
        // Implementar todos los constructores necesarios para crear objetos de distintas formas.

        // CONSIGNA 5:
        // Implementar métodos para acceder (getters) y modificar (setters) los atributos.
        // Recordá que todos los atributos deben estar encapsulados.

        // CONSIGNA 6:
        // Implementar un método que determine si el electrodoméstico es de bajo consumo.
        // Se considera bajo consumo si el consumo energético es menor a 45.

        // CONSIGNA 7:
        // Implementar un método que calcule el balance del producto.
        // El balance se obtiene dividiendo el precio por el peso.

        // CONSIGNA 8:
        // Implementar un método que indique si el producto es de alta gama.
        // Se considera de alta gama si el balance es mayor a 3.

        // CONSIGNA 9:
        // Crear al menos dos objetos de tipo Electrodomestico y probar los métodos implementados.
        // Mostrar los resultados por consola.

        // ¡Éxitos!
        
        //Creando nuevos electrodomesticos:
        Electrodomestico television = new Electrodomestico("Phillip 52'");
        Electrodomestico aspiradora = new Electrodomestico("Aspiradora P8", 500000, "blanca", 25, 10);
        
        television.verInfo();
        aspiradora.verInfo();

        television.SetColor("negro");
        television.SetNombre("Television Phillip 52'");
        television.SetConsumoEnergetico(10);
        television.SetPeso(50);
        television.SetPrecioBase(1000);
        
        television.verInfo();

        television.consumo();
        television.balance();
        television.altaGama();
    }
}

