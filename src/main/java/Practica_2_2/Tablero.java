package Practica_2_2;

public class Tablero {
    private static int Dimension = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[Dimension][Dimension];

    public void leerEstadoActual(){
       for(int i = 0; i < Dimension; i++){
           for(int j = 0; j < Dimension; j++){
               if(Math.random() < 0.5){
                   estadoActual[i][j] = 1;
               }else{
                     estadoActual[i][j] = 0;
               }

           }
       }


    }
    public void generarEstadoActualPorMontecarlo(){

    }
    public void transitarAlEstadoSiguiente(){

    }

    @Override
    public String toString(){
        return ""; // Esta línea hay que modificarla.
    }


public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.leerEstadoActual();
        System.out.println(tablero);
    }


}
