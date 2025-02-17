package org.helmer.appmockito.ejemplos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Producto[] productos;
        productos = new Producto[3];
        productos[0] = new Producto("Laptop", 2500);
        productos[1] = new Producto("Teclado", 25);
        productos[2] = new Producto("Mouse", 50);
        Arrays.sort(productos);
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        //Iterando en reversa
        System.out.println("Iterando en reversa");
        for (int i = productos.length -1;i >= 0; i--){
            System.out.println(productos[i].toString());
        }

        ArregloMutable.mutable(productos);

        //FizzBuzz
        for(int i=0; i <= 10; i++){
            boolean esDivisiblePor5 = i % 5 == 0;
            boolean esDivisiblePor7 = i % 7 == 0;
            if(esDivisiblePor5 && esDivisiblePor7){
                System.out.println("FizzBuzz");
            }else if(esDivisiblePor5){
                System.out.println("Fizz");
            }   else if(esDivisiblePor7){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }

    }
}