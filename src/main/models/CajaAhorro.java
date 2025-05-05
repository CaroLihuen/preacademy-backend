package main.models;

public class CajaAhorro extends Cuenta {
    private double saldo;
    private String numeroCuenta;

    public CajaAhorro(double nuevoSaldo, String nuevoNumeroCuenta) {
        super(nuevoSaldo, nuevoNumeroCuenta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void SetSaldo(double nuevoSaldo) {
        if (saldo == 0) {
            System.out.println("No tiene dinero en la Caja de Ahorro");
        } else {
            saldo = nuevoSaldo;
        }
    }

    public void depositar(double monto) {
        this.saldo = monto + this.saldo;
        System.out.println("Depósito realizado en la Caja de Ahorro");
    }

    public void retirar(double monto) {
        if (monto > 0) {
            this.saldo = this.saldo - monto;
            System.out.println("Retiro realizado en la Caja de Ahorro");
        } else {
            System.out.println("Saldo Insuficiente en la Caja de Ahorro");
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo actual es de: " + this.saldo + " en la Caja de Ahorro");
    }

}
