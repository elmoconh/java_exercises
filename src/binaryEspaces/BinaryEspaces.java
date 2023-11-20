package binaryEspaces;

import java.util.Scanner;

public class BinaryEspaces {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("number = " + number);
        number = sc.nextInt();
        //String number = JOptionPane.showInputDialog(null, "Ingrese un numero");

        int result = solution(number);

        //JOptionPane.showMessageDialog(null, "Resultado " + result);
        System.out.println("result = " + result);
    }

    private static int solution(Integer number) {

        String binary = Integer.toBinaryString(number);
        char[] arr = binary.toCharArray();
        String[] sNum = binary.split("1");
        int max = 0;
        int findNumber1 = 0;
        int notEmpty = 0;
        System.out.println("arr[0] = " + arr[0]);

        for (char c : arr) {
            if (c == '1') {
                findNumber1++;
            }
        }


        for (String data : sNum) {
            if (!data.isEmpty()) {
                int getLength = data.length();
                max = Math.max(max, getLength);
                notEmpty++;
            }
        }

        int aux = findNumber1 + notEmpty;
        if (findNumber1 == 1 && notEmpty == 1 && aux == 2) {
            return 0;
        }


        return max;
    }

}
