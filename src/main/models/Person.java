package main.models;

public class Person {
    private String nombre;
    private String edad;
    private String fechaNacimiento; 
    private int dni;
    private String sexo;
    private int peso;
    private int altura;
    
    public Person(int nuevoDni){
        this.dni = nuevoDni;
    }

    public Person(int nuevoDni, String nuevoNombre, String nuevoApellido){
        this.dni = nuevoDni;
        this.nombre = nuevoNombre + nuevoApellido;
    }

    public Person(int nuevoDni, String nuevoNombre, String nuevoApellido, String nuevaFechaNacimiento){
        this.dni = nuevoDni;
        this.nombre = nuevoNombre + nuevoApellido;
        this.fechaNacimiento = nuevaFechaNacimiento;
    }

    public void SetNombre(String nuevoNombre, String nuevoApellido){
        nombre = nuevoNombre + nuevoApellido;
    }

    public void setEdad(String nuevaEdad){
        edad= nuevaEdad ;
    }

    public void SetFechaNacimiento(String nuevaFhaNacimiento){
        fechaNacimiento= nuevaFhaNacimiento;
    }

    public void SetSexo(String nuevoSexo){
        sexo= nuevoSexo;
    }

    public void SetPeso(int nuevoPeso){
        peso= nuevoPeso;
    }

    public void SetAltura(int nuevaAltura){
        altura= nuevaAltura;
    }
    
}
