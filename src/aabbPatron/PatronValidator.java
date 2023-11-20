package aabbPatron;

public class PatronValidator {

    public static void main(String [] args){
        System.out.println("Ingrese un patrón");

        boolean result = solution("aabb");
    }


    private static boolean solution(String variable) {
        var lower = variable.toLowerCase();
        int countA = 0;
        int countB = 0;
        String aux;

        for (char c : lower.toCharArray()) {

            if (c == 'a') {
                countA++;
            } else {
                countB++;
            }
            aux = String.valueOf(c);
            if (aux != null && countB == 1 && countA == 1) {
                return false;
            }

        }

        // Si no hay 'b' o 'a' en la cadena, o si todas las 'a' están antes de 'b', retornamos verdadero
        return countB == 0 || countA < countB;
    }
}
