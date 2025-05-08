package main.person.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.lang.Math;

public class Person {
    private String nombre;
    private String edad;
    private String fechaNacimiento;
    private int dni;
    private String sexo;
    private int peso;
    private double altura;

    public Person(int nuevoDni) {
        this.dni = nuevoDni;
    }

    public Person(int nuevoDni, String nuevoNombre, String nuevoApellido) {
        this.dni = nuevoDni;
        this.nombre = nuevoNombre + nuevoApellido;
    }

    public Person(int nuevoDni, String nuevoNombre, String nuevoApellido, String nuevaFechaNacimiento) {
        this.dni = nuevoDni;
        this.nombre = nuevoNombre + nuevoApellido;
        this.fechaNacimiento = nuevaFechaNacimiento;
    }

    public void SetNombre(String nuevoNombre, String nuevoApellido) {
        nombre = nuevoNombre + nuevoApellido;
    }

    public void setEdad(String nuevaEdad) {
        edad = nuevaEdad;
    }

    public void SetFechaNacimiento(String nuevaFhaNacimiento) {
        fechaNacimiento = nuevaFhaNacimiento;
    }

    public void SetSexo(String nuevoSexo) {
        sexo = nuevoSexo;
    }

    public void SetPeso(int nuevoPeso) {
        peso = nuevoPeso;
    }

    public void SetAltura(double nuevaAltura) {
        altura = nuevaAltura;
    }

    public double masaCorporal() {
        double masaCorporal;
        int peso= this.peso;
        double altura = this.altura;
        masaCorporal = peso / Math.pow(altura, 2);
        System.out.println("La masa corporal es de "+ Math.round(masaCorporal));
        return masaCorporal;
    }

    public void estadoFisico(){
        if(masaCorporal() >= 18.5 & masaCorporal() < 25){
            System.out.println("La persona está en forma, la masa corporal es de: "+Math.round(masaCorporal()));
        } else{
            System.out.println("Hay que trabajar más en eso.., la masa corporal es de: "+Math.round(masaCorporal()));
        }
    }
    
    //falta redondear probar con otros métodos de fecha
    //Si fecha de hoy -fecha de nacimiento = edad
    public void fechaCumpleaños() {
        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaHoy = fechaLocal.format(fechaFormateada);

        System.out.println(this.fechaNacimiento == fechaHoy);
    }

    public boolean esMayorDeEdad() {
        int nEdad = Integer.parseInt(this.edad);
        if (nEdad >= 18) {
            System.out.println("Es mayor de 18");
            return true;
        } else {
            System.out.println("Es menor de 18");
            return false;
        }
    }

    public boolean puedeVotar() {
        int nEdad = Integer.parseInt(this.edad);
        if (nEdad > 16) {
            return true;
        } else {
            return false;
        }
    }

    // falta redondear
    public void verificarEdad() {
        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String fechaHoy = fechaLocal.format(fechaFormateada);
        System.out.println(this.fechaNacimiento == fechaHoy);
        // fecha actual - fecha de nacimiento = años
        // años = edad
        // si coincide genial "La fecha actual coincide"
        // sino hay algo que no cuadra
    }

    public void infoPerson() {
        System.out.println(this.nombre + " de " + this.edad + " años, con dni: " + this.dni
                + " ,con fecha de nacimiento: " + this.fechaNacimiento + ", de sexo: " + this.sexo + ", con peso de:"
                + this.peso + "kg. con altura de: " + this.altura + " m.");
    }

}
