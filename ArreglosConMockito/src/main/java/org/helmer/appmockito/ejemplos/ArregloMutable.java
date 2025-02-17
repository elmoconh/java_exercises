package org.helmer.appmockito.ejemplos;

public class ArregloMutable {
    public static void mutable(Producto[] productos){
        System.out.println("productos = " + productos);
        int total = productos.length;
        System.out.println("==Revisamos los indices==");
        for (int i =0 ; i < total; i++){
            System.out.printf("para indice %d : %s%n", i, productos[i]);
        }
        System.out.println("==Mostramos los valores inversos ==");
        for (int i =0 ; i < total/2; i++){
            Producto actual = productos[i];
            System.out.println("actual = " + actual);
            Producto inverso = productos[productos.length -1 - i];
            System.out.println("inverso = " + inverso);
            productos[i]= inverso;
            productos[productos.length -1 - i] = actual;

        }
        System.out.println("==ahora volvemos a revisar los indices==");
        for (int i =0 ; i < total; i++){
            System.out.printf("para indice %d : %s%n", i, productos[i]);
        }
    }
}
