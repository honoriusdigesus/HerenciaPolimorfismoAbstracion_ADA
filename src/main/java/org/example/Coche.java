package org.example;

public class Coche extends Vehiculo{
    public Coche(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    void mostrarTipo() {
        System.out.println("Coche -> Class: Coche");
    }
}
