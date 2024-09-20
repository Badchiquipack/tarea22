package com.marriaga.model;

public class Lacteo extends Producto {

    private int cantidad;
    private int protreinas;

    public Lacteo(String nombre, double precio, int cantidad, int protreinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.protreinas = protreinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProtreinas() {
        return protreinas;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "cantidad=" + cantidad +
                ", protreinas=" + protreinas;
    }
}
