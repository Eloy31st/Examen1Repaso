package Practica_2_1;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    Algoritmo 1: Aproximación a pi mediante Montecarlo
Input: puntosTotales: cantidad de puntos a generar
Output: Número real que es una aproximación al número pi
aciertos 0;
areaCuadrado 4;
for i 1 to puntosTotales do
Obtener un número aleatorio x entre -1 y 1;
Obtener un número aleatorio y entre -1 y 1;
if d((x, y), (0, 0)) ≤ 1 then aciertos ← aciertos + 1;
end
 return areaCuadrado · (aciertos/puntosTotales) ;
     */
    public static double aproximacionPi(long puntosTotales) {
        int aciertos = 0;
        double areaCuadrado = 4;
        for (int i = 1; i <= puntosTotales; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                aciertos++;
            }
        }
        return (areaCuadrado * (aciertos / (double) puntosTotales));
    }

}

