package arrWork;

import java.util.Scanner;

/*
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
*/
public class ArrString {
    public static void main(String[] args) {
    getNames();
    }

        public static void getNames(){
        String nombre1, nombre2, nombre3,nombres;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 nombres");
        nombre1 = sc.nextLine();
        nombre2 = sc.nextLine();
        nombre3 = sc.nextLine();

        nombre1= nombre1.toUpperCase().charAt(1)+"."+nombre1.substring(nombre1.length()-2);
        nombre2= nombre2.toUpperCase().charAt(1)+"."+nombre2.substring(nombre2.length()-2);
        nombre3= nombre3.toUpperCase().charAt(1)+"."+nombre3.substring(nombre3.length()-2);

        nombres =(nombre1 +" " + nombre2+" "+ nombre3).replaceAll(" ", "_");
        System.out.println("nombres = " + nombres);

    }

}
