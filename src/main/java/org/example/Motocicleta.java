package org.example;

public class Motocicleta extends Vehiculo{
    public Motocicleta(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    void mostrarTipo() {
        System.out.println("Motocicleta -> Class: Motocicleta");
    }
}
