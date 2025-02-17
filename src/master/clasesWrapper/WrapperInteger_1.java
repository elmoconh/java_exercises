package master.clasesWrapper;

public class WrapperInteger_1 {
    public static void main(String[] args) {
        int intPrimitive = 2345655;
        Integer intObj = Integer.valueOf(intPrimitive);
        //Con el método valueOf() se crea un objeto Integer a partir de un int.
        Integer intObj2 = intPrimitive;
        //Con la autoboxing se crea un objeto Integer a partir de un int, sin necesidad de usar el método valueOf().

        int num2 = intObj2;
        //Con la autounboxing se crea un int a partir de un objeto Integer, sin necesidad de usar el método intValue().
        int num = intObj.intValue();
        //Con el método intValue() se obtiene el valor int del objeto Integer.

        System.out.println("num = " + num);
        System.out.println("intObj2 = " + intObj2);

        Short shortObj = intObj.shortValue();
        //Con el método shortValue() se obtiene el valor short del objeto Integer.

        System.out.println("shortObj = " + shortObj);

        Byte byteObj = intObj.byteValue();
        //Con el método byteValue() se obtiene el valor byte del objeto Integer.

        Long longObj = intObj.longValue();
        //Con el método longValue() se obtiene el valor long del objeto Integer.

        System.out.println("longObj = " + longObj);

        //Observamos que con Short y Byte se pierde información, ya que el valor de intObj es mayor que el valor máximo de Short y Byte. por eso aparecen impresos valores negativos.

    }
}
