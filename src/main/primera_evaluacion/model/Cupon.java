package main.primera_evaluacion.model;

public class Cupon {
    //Atributos: String codigo, double porcentajeDescuento.
    //Implementar constructor vacío, getters y setters.

    private String codigo;
    private double porcentajeDescuento;

    public Cupon() {
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPorcentajeDesc() {
        return porcentajeDescuento;
    }

    public void SetCodigo(String newCode) {
        codigo = newCode;
    }

    public void SetPorcentajeDesc(double newPorcDesc) {
        porcentajeDescuento = newPorcDesc;
    }

}