package main.initial.service;

import main.initial.models.Persona;

public class Initial {

    public static void main(String[] args) {
        //TODO: Hola chicos 😊 ¡Bienvenidos al primer desafío de Programación Orientada a Objetos en Java

        // CONSIGNA 1:
        // Crear un nuevo package dentro del path src/main llamado models.
        // Ese package es donde deben colocar las clases que van a crear a continuación.
       
        // CONSIGNA 2:
        // Crear una clase llamada "Persona" dentro del path src/main.
        // La clase debe tener los siguientes atributos privados:
        // - String nombre
        // - int edad
        // - String dni

        // CONSIGNA 3:
        // En la clase Persona, crear un constructor que reciba los 3 atributos por parámetro
        // y los asigne correctamente.

        // CONSIGNA 4:
        // Crear los métodos getter y setter para todos los atributos.

        // CONSIGNA 5:
        // Crear un método llamado mostrarInformacion() que imprima los datos de la persona.

        // CONSIGNA 6:
        // Desde este método main, crear al menos 2 objetos Persona con diferentes datos.
        // Luego, llamar al método mostrarInformacion() de cada uno.

        // CONSIGNA 7:
        // Cambiar la edad de una de las personas utilizando el setter correspondiente,
        // y luego volver a mostrar la información actualizada.

        // CONSIGNA 8 (DESAFÍO EXTRA):
        // Crear un método llamado esMayorDeEdad() que devuelva true si la edad es mayor o igual a 18.
        // Usar este método desde el main para saber si las personas son mayores de edad.

        // TODO: ↓ Acá podés comenzar a resolver desde el main:

        // ¡A codear!

        //Creando nuevas personas
        Persona mariano = new Persona("Mariano",35,"45683287");
        Persona julia = new Persona("Julia",27,"35489235");
        Persona rosario = new Persona("Rosario",18,"38742354");
        
        //llamando al métoddo mostratInformación.
        mariano.mostrarInformacion();
        julia.mostrarInformacion();
        
        //Agregando nueva edad y después mostrando
        mariano.SetEdad(8);
        mariano.mostrarInformacion();
        
        //preguntando la edad con su método
        mariano.esMayorDeEdad();
        julia.esMayorDeEdad();
        rosario.esMayorDeEdad();
    }
}