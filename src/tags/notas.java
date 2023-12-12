package tags;

public class notas {

    public static void main(String[] args) {

        /* ********** SIN EL USO DE ETIQUETAS **********

         En un bucle de Java, la instrucción break o continue afectará al bucle más interno en el que se encuentra. En otras palabras, se saldría o saltaría del bucle que contiene directamente la instrucción break o continue.
         En el caso de un bucle anidado, el break o continue afectará al bucle más cercano.

         Aquí hay un ejemplo que ilustra esto, utilizando el break:

         */
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                if (i * j == 6) {
                    System.out.println("Se encontró 6 en i=" + i + ", j=" + j);
                    break;  // Se saldrá del bucle "for (int j = 1; j <= 3; j++)"
                }
            }

        }
/*
        En este caso, el break afectaría al bucle for (int j = 1; j <= 3; j++), que es el bucle más cercano. Cuando se encuentra el valor 6, el bucle for (int j = 1; j <= 3; j++) se interrumpe, pero el bucle for (int i = 1; i <= 3; i++) continuará su ejecución desde la siguiente iteración.

                Sin el uso de etiquetas, la instrucción break o continue afecta al bucle en el que se encuentra directamente. Esto significa que un break interrumpirá el bucle más cercano que lo contiene, y un continue saltará al inicio del bucle más cercano que lo contiene.


                ----------------------------------------------------------
                ********** CON EL USO DE ETIQUETAS **********

        Si tienes bucles anidados y deseas controlar un bucle específico en un nivel superior, debes utilizar etiquetas para etiquetar el bucle y luego utilizar esas etiquetas con las instrucciones break o continue para especificar cuál de los bucles quieres interrumpir o saltar.

                En Java, las etiquetas se utilizan principalmente en combinación con instrucciones de bucle, como for, while y do-while, junto con las sentencias break y continue. Estas etiquetas se utilizan para controlar el flujo de ejecución en bucles anidados.

                Aquí hay un ejemplo de cómo se utilizan las etiquetas en Java:

*/
        outerLoop:
        for (int i = 1; i <= 3; i++) {

            innerLoop:
            for (int j = 1; j <= 3; j++) {
                if (i * j == 6) {
                    System.out.println("Se encontró 6 en i=" + i + ", j=" + j);
                    break outerLoop;  // Salir del bucle etiquetado "outerLoop"
                }
            }

        }
/*
        En el ejemplo anterior, hemos etiquetado dos bucles: "outerLoop" e "innerLoop". Cuando se encuentra el valor 6, utilizamos break outerLoop; para salir del bucle etiquetado "outerLoop".
        Esto nos permite controlar el flujo de ejecución de manera más específica en situaciones con bucles anidados.
        En resumen, las etiquetas en Java se utilizan para proporcionar un mayor control sobre las instrucciones de bucle anidadas, permitiéndote salir de un bucle específico o continuar con un
        bucle específico cuando sea necesario. Sin embargo, se deben usar con precaución, ya que su uso excesivo puede complicar el código y dificultar su mantenimiento.
        */

    }
}
