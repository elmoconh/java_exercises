package org.helmer.appmockito.ejemplos;

public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        System.out.println("Se ha creado un nuevo producto llamado " + nombre + " con un precio de " + precio + " dolares");
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareTo(o.nombre);
    }
}
