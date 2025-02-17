package master.clasesWrapper;

public class WrapperBoolean_5 {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        //Con el método valueOf() se crea un objeto Boolean a partir de un boolean.
        Boolean objBoolean2 = Boolean.valueOf("false");
        //Con el método valueOf() se crea un objeto Boolean a partir de un String.

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Comparando dos objetos Boolean con el método equals: " + (objBoolean == objBoolean2));
        //A difeerencia de los objetos Integer, los objetos Boolean se pueden comparar con el operador ==,  ya que el compilador los trata como objetos y no como primitivos.


    }
}
