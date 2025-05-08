package main.bank.models;

//Hacer
public class Cuenta {
    private double saldo;
    private String numeroCuenta;

    public Cuenta(double nuevoSaldo, String nuevoNumeroCuenta) {
        this.saldo = nuevoSaldo;
        this.numeroCuenta = nuevoNumeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void SetSaldo(double nuevoSaldo) {
        if (saldo == 0) {
            System.out.println("No tiene dinero en la Cuenta");
        } else {
            saldo = nuevoSaldo;
        }
    }

    public void depositar(double monto) {
        this.saldo = monto + this.saldo;
        System.out.println("Depósito realizado en la Cuenta");
    }

    public void retirar(double monto) {
        if (monto > 0) {
            this.saldo = this.saldo - monto;
            System.out.println("Retiro realizado en la Cuenta");
        } else {
            System.out.println("Saldo Insuficiente en la Cuenta");
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo actual en la Cuenta es de: " + this.saldo);
    }

    // me falta repensarlo //podría no ser static
    public static void transferir(Cuenta origen, Cuenta destino, double monto) {
        // if(destino){
        // Cuenta numeroNuevo = new Cuenta(monto, null)
        // }

    }
}
