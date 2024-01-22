package org.example;

public class CocheControlable extends Vehiculo implements Controlable{
    public CocheControlable(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void encender() {
        System.out.println("Coche encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Coche apagado");
    }

    @Override
    void mostrarTipo() {
        System.out.println("Coche tipo controlable");
    }
}
