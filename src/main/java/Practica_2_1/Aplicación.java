package Practica_2_1;


import java.util.Scanner;

public class Aplicación {
    public static void main(String[] args) {
        System.out.println("Introducer la cantidad de puntos a generar: ");
        long puntosTotales = new Scanner(System.in).nextLong();
        System.out.println("El número PI es " + Ejercicio1.aproximacionPi(puntosTotales));
    }
}
