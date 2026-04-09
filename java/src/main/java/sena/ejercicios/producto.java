package sena.ejercicios;

public class Producto {

    // ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;

    // CONSTRUCTOR VACÍO
    public Producto() {
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("Precio inválido");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("Stock inválido");
        }
    }

    // MÉTODO VENDER
    public void vender(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("❌ Error: cantidad inválida");
        } else if (cantidad > stock) {
            System.out.println("❌ Error: no hay suficiente stock");
        } else {
            stock -= cantidad;
            System.out.println("✅ Venta realizada de " + cantidad + " unidad(es) de " + nombre);
        }
    }

    // MOSTRAR INFO
    public String mostrarProducto() {
        return "Producto: " + nombre +
               "\nPrecio: $" + precio +
               "\nStock: " + stock;
    }
}
