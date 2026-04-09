package sena.ejercicios;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> productos;

    // CONSTRUCTOR
    public Carrito() {
        productos = new ArrayList<>();
    }

    // AGREGAR PRODUCTO
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // CALCULAR TOTAL
    public double total() {
        double suma = 0;

        for (Producto p : productos) {
            suma += p.getPrecio();
        }

        return suma;
    }

    // LISTAR PRODUCTOS
    public void listar() {
        for (Producto p : productos) {
            System.out.println(p.mostrarProducto());
            System.out.println("------------------------");
        }
    }
}
