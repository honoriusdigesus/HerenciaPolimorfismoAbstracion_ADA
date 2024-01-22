package org.example;

public class MotocicletaControlable extends Vehiculo implements Controlable{
    public MotocicletaControlable(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void encender() {
        System.out.println("Motocicleta encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Motocicleta apagada");
    }

    @Override
    void mostrarTipo() {
        System.out.println("Motocicleta tipo adventure");
    }
}
