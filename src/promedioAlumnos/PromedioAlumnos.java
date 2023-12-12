package promedioAlumnos;

import java.util.Scanner;

public class PromedioAlumnos {
/*
* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
* */

    public static void main( String[] args){
        double sumaNotas = 0;
        double promedioNotas;
        double notasMayoresA5 = 0;
        double notasMenoresA4 = 0;

        double promedioNotasMayoresA5 = 0;
        double promedioNotasMenoresA4 = 0;


        int cantidadNotas1 = 0;
        int cantidadNotasMayoresA5 = 0;
        int cantidadNotasMenoresA4 = 0;
        int cantidadNotas = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            double nota;

            do {
                System.out.println("Ingrese nota " + (i + 1) + ": ");
                nota = sc.nextDouble();
            } while (nota < 0 || nota > 7);

            if (nota == 0) {
                System.out.println("Error, no se puede ingresar 0");
                break;
            }
            sumaNotas += nota;
            cantidadNotas++;
            if (nota == 1) {
                cantidadNotas1++;
            }
            if (nota > 5) {
                notasMayoresA5 += nota;
                cantidadNotasMayoresA5++;
            }
            if (nota < 4) {
                notasMenoresA4 += nota;
                cantidadNotasMenoresA4++;
            }
        }

        promedioNotas = sumaNotas / cantidadNotas;
        promedioNotasMayoresA5 = notasMayoresA5 / cantidadNotasMayoresA5;
        promedioNotasMenoresA4 = notasMenoresA4 / cantidadNotasMenoresA4;

        System.out.println("Cantidad de notas 1: " + cantidadNotas1);
        System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        System.out.println("Promedio de notas menores a 4: " + promedioNotasMenoresA4);
        System.out.println("Promedio total: " + promedioNotas);

    }


}
