package cutToFirstUpper;

import java.util.Scanner;

public class CutToFirstUpper {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        System.out.println(CutToFirstUpper.findUpper(frase));
    }

    private static String findUpper(String frase){
        String fraseRecortada = "";
        String msgError = "No se pudo encontrar mayusculas";
        int longitud = frase.length();

        if (frase.isEmpty()) {
            return msgError;
        } else if (Character.isUpperCase(frase.charAt(0))) {
            return frase;

        } else {
            fraseRecortada = frase.substring(1, longitud);
            return findUpper(fraseRecortada);
        }

    }
}
