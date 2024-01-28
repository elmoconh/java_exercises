package ageCalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) throws ParseException {
        int year = 0;
        int month = 0;
        int day = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento");
        year = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        month = sc.nextInt();
        System.out.println("Ingrese su dia de nacimiento");
        day = sc.nextInt();

        String fechaNacimiento = day + "/" + month + "/" + year;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaNac = sdf.parse(fechaNacimiento);
            Date hoy = new Date();
            Date edad = new Date(hoy.getTime() - fechaNac.getTime());

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(edad);

            System.out.println("Su edad es: " + (calendario.get(Calendar.YEAR) - 1970) + " años");


        } catch (ParseException ex) {
            System.out.println("Error: " + ex);
        }


    }
}
