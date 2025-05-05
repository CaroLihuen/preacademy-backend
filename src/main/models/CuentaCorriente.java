package main.models;

public class CuentaCorriente extends Cuenta {
    private double saldo;
    private String numeroCuenta;

    public CuentaCorriente(double nuevoSaldo, String nuevoNumeroCuenta) {
        super(nuevoSaldo, nuevoNumeroCuenta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void SetSaldo(double nuevoSaldo) {
        if (saldo == 0) {
            System.out.println("No tiene dinero en la Cuenta Corriente");
        } else {
            saldo = nuevoSaldo;
        }
    }

    public void depositar(double monto) {
        this.saldo = monto + this.saldo;
        System.out.println("Depósito realizado en la Cuenta Corriente");
    }
    
    @Override
    public void retirar(double monto) {
        if (monto > -1000) {
            this.saldo = this.saldo - monto;
            System.out.println("Retiro realizado en la Cuenta Corriente");
        } else {
            System.out.println("Ya no se puede retirar más de la Cuenta Corriente");
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo actual es de: " + this.saldo + " en la Cuenta Corriente");
    }

}
