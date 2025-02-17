package master.datetime;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formato.format(fecha));
        // fecha en milisegundos desde 1 de enero de 1970
        System.out.println(fecha.getTime());

        Date fecha_partida = new Date();
        Date fecha_llegada = new Date();
        for (int i = 0; i < 1000000000; i++) {
            if (i == 1000000000 - 1) {
                fecha_llegada = new Date();
            }
        }

        long milisegundos = fecha_llegada.getTime() - fecha_partida.getTime();
        System.out.println("tiempo "+milisegundos/1000f+" segundos");

        ejemploCalendar();
        stringToDate();
    }

    //Ejemplo clase calendar
    public static void ejemploCalendar(){

        Calendar calendario = Calendar.getInstance();
        calendario.set(2020, 0, 1, 0, 0, 0);
        Date fecha = calendario.getTime();
        System.out.println("Ejemplo calendar: "+fecha);

        //otra forma de hacerlo con constantes
        calendario.set(Calendar.YEAR, 1992);
        calendario.set(Calendar.MONTH, 6);
        calendario.set(Calendar.DAY_OF_MONTH, 3);

        calendario.set(Calendar.HOUR_OF_DAY, 18);
        calendario.set(Calendar.MINUTE, 25);
        calendario.set(Calendar.SECOND, 0);

        fecha = calendario.getTime();
        System.out.println("Ejemplo calendar con constantes : "+fecha);
    }

    public static void stringToDate(){
        String fecha = "01/01/2020";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaDate = formato.parse(fecha);
            Date hoy = new Date();
            System.out.println("Fecha convertida a date: "+ fechaDate);

            if (fechaDate.before(hoy)){
                System.out.println("La fecha es anterior a hoy");
            }else if (fechaDate.after(hoy)) {
                System.out.println("La fecha es posterior a hoy");
            }else if (fechaDate.equals(hoy)){
                 System.out.println("La fecha es igual a hoy");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}