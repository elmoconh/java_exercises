package master.clasesWrapper;

public class WrapperOperadoresRelacionales_4 {
    public static void main(String[] args) {

        Integer number1 = Integer.valueOf(1000);
        Integer number2 = number1;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("Son el mismo objeto? " + (number1 == number2 ? "Si" : "No"));

        number2 = 1000;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("Son el mismo objeto? " + (number1 == number2 ? "Si" : "No"));
        //Con el operador == se compara si dos objetos Integer son el mismo objeto, es decir, si apuntan a la misma dirección de memoria.
        //En este caso, como number1 y number2 apuntan a la misma dirección de memoria, el resultado es true.

        System.out.println("Tienen el mismo valor? " + (number1.equals(number2) ? "Si" : "No"));
        //Con el método equals() se compara si dos objetos Integer tienen el mismo valor.
        //En este caso, como number1 y number2 tienen el mismo valor, el resultado es true.

        System.out.println("Tienen el mismo valor? " + (number1.intValue() == number2.intValue() ? "Si" : "No"));
        //Con el método intValue() se obtiene el valor int del objeto Integer de forma explícita.
        //En este caso, como number1 y number2 tienen el mismo valor, el resultado es true.
        //Java hasta 127 crea un objeto Integer y lo guarda en la memoria cache, por eso number1 y number2 apuntan al mismo objeto.
        //PERO si el valor es mayor a 127, Java crea un nuevo objeto Integer y lo guarda en la memoria heap, por eso number1 y number2 apuntan a objetos diferentes.

        boolean condicion = number1 > number2;
        System.out.println("condicion = " + condicion);
        // Ya sea con los operadores >, <, >=, <=, !=  estos operadores comparan el valor de los objetos Integer.
        // A diferencia del operador ==, estos operadores comparan el valor de los objetos Integer, no la dirección de memoria a la que apuntan.
        //Por ende no es necesario usar el método intValue() para obtener el valor int del objeto Integer de forma explícita.

    }
}
