package minorNumber;

import java.util.Scanner;

public class MinorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[10];

        System.out.println("Ingrese 10 números completos");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número : ");
            int number = sc.nextInt();
            numbers[i] = number;
        }

        System.out.println(compareNumbers(numbers));
    }

    static String compareNumbers(Integer[] numbers) {
        int[] minorNumber = new int[10];
        int minor;
        for (Integer number : numbers) {
            if (number < minorNumber[0]) {
                minorNumber[0] = number;
            }
        }
        minor = minorNumber[0];

        return minor > 10 ? "el número es mayor que 10!" : "el número es menor que 10!";
    }
}
