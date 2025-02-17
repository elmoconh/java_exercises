package gasolineTank;

import java.util.Scanner;

public class GasolineTank {
    public static void main (String[] args){

        int gas = 70;
        double gasActual;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de gasolina actual");
        gasActual = sc.nextDouble();

        if (gasActual == gas){
            System.out.println("Estanque lleno");
        }else if (gasActual < gas && gasActual >= 60){
            System.out.println("Estanque casi lleno");
        }else if (gasActual < 60 && gasActual >= 40){
            System.out.println("Estanque 3/4");
        }else if (gasActual < 40 && gasActual >= 35){
            System.out.println("Medio Estanque");
        }else if (gasActual < 35 && gasActual >= 20){
            System.out.println("Suficiente");
        }else if (gasActual < 20 && gasActual >= 1){
            System.out.println("Insuficiente");
        }else {
            System.out.println("Estanque vacio");
        }

    }
}
