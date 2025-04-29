package main.models;

public class Persona {
    private String nombre;
            private int edad;
            private String dni;

            public Persona(String nuevoNombre, int nuevaEdad, String nuevodni){
               this.nombre = nuevoNombre;
               this.edad = nuevaEdad;
               this.dni = nuevodni; 
            }

            public int getEdad(){
                return edad;
            }
            public String getDni(){
                return dni;
            }
            public String getNombre(){
                return nombre;
            }
            public void SetEdad(int nuevaEdad){
                edad = nuevaEdad;
            }
            public void SetDni(String nuevoDNI){
                dni = nuevoDNI;
            }
            public void SetNombre(String nuevoNombre){
                nombre = nuevoNombre;
            }

            public void mostrarInformacion(){
                System.out.println(this.nombre+" de "+this.edad+" años, con dni: "+this.dni);
            }

            public void esMayorDeEdad(){
              if(this.edad>18){
                System.out.println("Es mayor de 18, :D ");
              } else if(this.edad==18){
                System.out.println("Tiene 18, :) ");
              } else{
                System.out.println("Es menor de 18, :( ");
              }
            }
}
