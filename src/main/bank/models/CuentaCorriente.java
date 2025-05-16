package main.bank.models;

public class CuentaCorriente extends Cuenta {
    private double saldo;
    private String numeroCuenta;

    public CuentaCorriente(double nuevoSaldo, String nuevoNumeroCuenta) {
        super(nuevoSaldo, nuevoNumeroCuenta);
    }

    @Override
    public void retirar(double monto) {
        double limiteSobregiro = -1000;
        if ((this.saldo - monto) >= limiteSobregiro) {
            this.saldo = this.saldo - monto;
            System.out.println("Retiro realizado en la Cuenta Corriente, el saldo ahora es de: "+ this.saldo);
        } else {
            System.out.println("Ya no se puede retirar más de la Cuenta Corriente, el saldo es "+ this.saldo);
        }
    }

}
