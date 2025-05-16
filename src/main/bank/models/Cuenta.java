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

    public static void transferir(Cuenta origen, Cuenta destino, double monto) {
        if(monto > 0 && origen.getSaldo() >=monto ){
          origen.SetSaldo(origen.getSaldo() - monto);
          destino.SetSaldo(destino.getSaldo() + monto);
          System.out.println("Transferencia realizada, el saldo en cuenta de origen es de: "+ origen.getSaldo()+
          ". El saldo en cuenta destino es de: "+ destino.getSaldo());
        } else{
            System.err.println("Ocurrio un error en la transferencia.");
        }

    }
}
