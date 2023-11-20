package sortTwoNumbers;

import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        int number1;
        int number2;
        int mayor;
        int menorNum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        number1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        number2 = sc.nextInt();

        if (number1 > number2) {
            mayor = number1;
            menorNum = number2;
        } else {
            mayor = number2;
            menorNum = number1;
        }
        System.out.println("El numero mayor es: " + mayor+ " y el numero menor es: " + menorNum);

    }

}
