package tags;

public class Main {

    public static void main(String[] args) {
        String frase = "tres tristes tigres comen trigo en un trigal";
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int contador = 0;


        for (int i = 0; i < maxFrase; i++) {
            if (frase.charAt(i) != 't') {
                //El continue hace que se salte el resto del bucle y pase a la siguiente iteración
                //por ejemplo si la frase es "tres tristes tigres comen trigo en un trigal"
                //y estamos en la posición 5, que es la primera t, se salta el resto del bucle
                continue;
            }
            contador++;
        }
        System.out.println("Total de t: " + contador);
        /*Buscad la palabra "trigo" en la frase "tres tristes tigres comen trigo en un trigal"
        y contad cuantas veces aparece.*/
        contador = 0;
        buscar:
        for (int i =0;  i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            contador++;
        }
        System.out.println("Total de palabra trigo: " + contador);

    }
}
