package org.example;

abstract class Vehiculo {
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    abstract void mostrarTipo();
}
