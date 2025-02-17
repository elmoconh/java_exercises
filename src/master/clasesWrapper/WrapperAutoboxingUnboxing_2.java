package master.clasesWrapper;

public class WrapperAutoboxingUnboxing_2 {
    public static void main(String[] args) {
        Integer [] enteros = {1, 2,3,4,5,6,7,8,9,10};
        //Con la autoboxing se crea un objeto Integer a partir de un int, sin necesidad de usar el método valueOf().
        int suma = 0;
        for (Integer entero : enteros) {
            if(entero % 2 == 0){
                suma += entero;
            }

        }
        System.out.println("suma = " + suma);
        //Con la autounboxing se crea un int a partir de un objeto Integer, sin necesidad de usar el método intValue().
        suma = 0;
        for (Integer entero : enteros) {
            if(entero.intValue() % 2 == 0){
                suma += entero.intValue();
            }

        }
        System.out.println("suma 2  = " + suma);
        //Con el método intValue() se obtiene el valor int del objeto Integer de forma explícita.
    }


}
