package main.person.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.Math;

public class Person {
    private String nombre;
    private String edad;
    private String fechaNacimiento;
    private int dni;
    private String sexo; //podría ser Char
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
        nombre = nuevoNombre +" "+nuevoApellido;
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
        //System.out.println("La masa corporal es de "+ Math.round(masaCorporal));
        return masaCorporal; 
    }

    public void estadoFisico(){
        if(masaCorporal() >= 18.5 & masaCorporal() < 25){
            System.out.println("La persona está en forma, la masa corporal es de: "+Math.round(masaCorporal()));
        } else{
            System.out.println("Hay que trabajar más en eso.., la masa corporal es de: "+Math.round(masaCorporal()));
        }
    }
    
    public void fechaCumpleaños() {
        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("d 'de' MMMM yyyy", Locale.forLanguageTag("es"));
        LocalDate fNaci  = LocalDate.parse(this.fechaNacimiento, fechaFormateada);
        System.out.println( fNaci.getDayOfMonth() == fechaLocal.getDayOfMonth() && fNaci.getMonth() == fechaLocal.getMonth());
    }

    public boolean esMayorDeEdad() {
        int nEdad = Integer.parseInt(this.edad);
        return nEdad >= 18;
    }

    public boolean puedeVotar() {
        int nEdad = Integer.parseInt(this.edad);
        if (nEdad > 16) {
            return true;
        } else {
            return false;
        }
    }

    public void verificarEdad() {
        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("d 'de' MMMM yyyy", Locale.forLanguageTag("es"));
        LocalDate fNaci  = LocalDate.parse(this.fechaNacimiento, fechaFormateada);

        int edad = fechaLocal.getYear() - fNaci.getYear();
        if(edad == Integer.parseInt(this.edad)){
           System.out.println("La edad coincide con la fecha de nacimiento.");
        } else{
           System.out.println("La edad no coincide con la fecha de nacimiento.");
        }
    }

    public void infoPerson() {
        System.out.println(this.nombre + " de " + this.edad + " años, con dni: " + this.dni
                + " ,con fecha de nacimiento: " + this.fechaNacimiento + ", de sexo: " + this.sexo + ", con peso de:"
                + this.peso + "kg. con altura de: " + this.altura + " m.");
    }

}
