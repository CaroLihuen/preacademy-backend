package main.bank.models;

public class CajaAhorro extends Cuenta {
    private double saldo;
    private String numeroCuenta;

    public CajaAhorro(double nuevoSaldo, String nuevoNumeroCuenta) {
        super(nuevoSaldo, nuevoNumeroCuenta);
    }

}
