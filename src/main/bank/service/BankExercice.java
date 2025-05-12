package main.bank.service;

import main.bank.models.Cuenta;
import main.bank.models.CajaAhorro;
import main.bank.models.CuentaCorriente;

public class BankExercice {
    public static void main(String[] args) {

        // TODO: ¡Bienvenidos! Hoy van a programar para un banco en Java 😱
        // Este ejercicio les permitirá practicar herencia, encapsulamiento, métodos
        // estáticos
        // y organización de clases aplicando Programación Orientada a Objetos.

        // CONSIGNA 1:
        // Crear una clase abstracta llamada "Cuenta" dentro del package models.
        // La clase debe tener los siguientes atributos privados:
        // - double saldo
        // - String numeroCuenta

        // CONSIGNA 2:
        // En la clase Cuenta, crear un constructor que reciba ambos atributos por
        // parámetro
        // y los asigne correctamente.

        // CONSIGNA 3:
        // Crear métodos públicos para:
        // - depositar(double monto): suma el monto al saldo.
        // - retirar(double monto): resta el monto del saldo, si hay suficiente dinero.
        // - mostrarSaldo(): imprime el saldo actual. (Este puede ser protected)

        // CONSIGNA 4:
        // Crear los métodos getter y setter para el atributo saldo (pueden incluir
        // controles dentro de los mismos, por ejemplo, para informar que no tiene
        // saldo).

        // CONSIGNA 5:
        // Crear un método estático llamado transferir(Cuenta origen, Cuenta destino,
        // double monto)
        // que reste el dinero de la cuenta origen y lo deposite en la cuenta destino.
        // Si no hay saldo suficiente, debe mostrar un mensaje de error.

        // CONSIGNA 6:
        // Crear dos clases que hereden de Cuenta:
        // - CajaAhorro
        // - CuentaCorriente
        // Cada una debe tener su constructor y heredar correctamente el comportamiento
        // de Cuenta.

        // CONSIGNA 7:
        // Desde este método main, crear un objeto CajaAhorro y otro CuentaCorriente.
        // Probar los métodos depositar, retirar, mostrarSaldo y transferir.

        // CONSIGNA 8 (DESAFÍO EXTRA):
        // Sobreescribir el método retirar en CuentaCorriente para permitir saldo
        // negativo
        // (por ejemplo, permitir que el saldo llegue hasta -1000)

        // TODO: ↓ Acá podés comenzar a resolver desde el main:

        // ¡A programar!

        // Probando Cuenta
       // Cuenta numero1 = new Cuenta(25550.00d, "488sg57");

       // numero1.mostrarSaldo();
       // numero1.depositar(25000);
       // numero1.retirar(50000);
       // numero1.SetSaldo(10);
       // numero1.mostrarSaldo();

        // Probando Caja de Ahorro
       // CajaAhorro numero2 = new CajaAhorro(80010.00d, "7584hj9");

      //  numero2.mostrarSaldo();
       // numero2.depositar(25000);
      //  numero2.retirar(50000);
      //  numero2.SetSaldo(10);
      //  numero2.mostrarSaldo();

        // Probando Cuenta Corriente
        CuentaCorriente numero3 = new CuentaCorriente(50000, "3518ku8");

        numero3.mostrarSaldo();
        //numero3.depositar(25000);
        numero3.retirar(10000);
        //numero3.SetSaldo(10);
        numero3.mostrarSaldo();
    }
}
