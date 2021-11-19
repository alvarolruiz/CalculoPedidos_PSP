package com.company;

import java.util.Random;

public class Producto {
    public static final String[] TIPOS_PRODUCTO={"Herramienta","Recambio","Limpieza"};
    public static final Random aleatorios = new Random();
    public String tipoProducto;
    public int cantidad;
    public float precio;

    public Producto() {
        this.tipoProducto = generarTipoProducto();
        this.cantidad = generarCantidad();
        this.precio = generarPrecio();
    }

    private float generarPrecio() {
        return 0;
    }

    private int generarCantidad() {
        int cantidad = 1+aleatorios.nextInt(51-1);
        return cantidad;
    }

    private String generarTipoProducto() {
        int cantidadTipos =TIPOS_PRODUCTO.length-1;
        int elegido=aleatorios.nextInt(cantidadTipos);
        return TIPOS_PRODUCTO[elegido];

    }
}
