package main.models;
//Hacer
public class Cuenta {
    private double saldo;
    private String numeroCuenta;

    public Cuenta(double nuevoSaldo, String nuevoNumeroCuenta ){
        this.saldo= nuevoSaldo;
        this.numeroCuenta= nuevoNumeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void SetSaldo(double nuevoSaldo) {
        if(saldo == 0){
            System.out.println("No tiene dinero");
        } else{ 
          saldo = nuevoSaldo;  
        }
    }

    public void depositar(double monto){
        this.saldo = monto + this.saldo;
        System.out.println("Depósito realizada");
    }

    public void retirar(double monto){
        if(monto > 0){
            this.saldo = this.saldo - monto ;
            System.out.println("Retiro realizada");
        }else{

            System.out.println("Saldo Insuficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("El saldo actual es de: "+this.saldo);
    }


}
