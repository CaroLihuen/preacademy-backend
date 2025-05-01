package main.models;

public class CuentaCorriente  extends Cuenta {
    private double saldo;
    private String numeroCuenta;

    public CuentaCorriente(double nuevoSaldo, String nuevoNumeroCuenta ){
        super(nuevoSaldo, nuevoNumeroCuenta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void SetSaldo(double nuevoSaldo) {
        if(saldo == 0){
            System.out.println("No tiene dinero en la Cuenta Corriente");
        } else{ 
          saldo = nuevoSaldo;  
        }
    }

    public void depositar(double monto){
        this.saldo = monto + this.saldo;
        System.out.println("Depósito realizado en la Cuenta Corriente");
    }

    public void retirar(double monto){
        if(monto > 0){
            this.saldo = this.saldo - monto ;
            System.out.println("Retiro realizado en la Cuenta Corriente");
        }else{
            System.out.println("Saldo Insuficiente en la Cuenta Corriente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("El saldo actual es de: "+this.saldo+" en la Cuenta Corriente");
    }
    
}
