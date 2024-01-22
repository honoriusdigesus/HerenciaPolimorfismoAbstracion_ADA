package org.example;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche(200);
        coche.mostrarTipo();

        Motocicleta moto = new Motocicleta(150);
        moto.mostrarTipo();

        // Crea objetos de CocheControlable y MotocicletaControlable y prueba los métodos
        CocheControlable cocheControlable = new CocheControlable(180);
        cocheControlable.mostrarTipo();
        cocheControlable.encender();
        cocheControlable.apagar();

        MotocicletaControlable motoControlable = new MotocicletaControlable(120);
        motoControlable.mostrarTipo();
        motoControlable.encender();
        motoControlable.apagar();
    }
}