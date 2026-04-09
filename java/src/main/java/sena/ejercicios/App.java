package sena.ejercicios;

public class App {

    public static void main(String[] args) {

        // CREAR PRODUCTOS
        Producto p1 = new Producto("Laptop", 2500000, 5);
        Producto p2 = new Producto("Mouse", 50000, 10);


        Producto p3 = new Producto();
        p3.setNombre("Teclado");
        p3.setPrecio(120000);
        p3.setStock(7);

        
        p1.vender(2);
        p2.vender(15); 
        p3.vender(1);

      
        Carrito carrito = new Carrito();

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

       
        System.out.println("\n🛒 PRODUCTOS EN EL CARRITO:");
        carrito.listar();

      
        System.out.println("💰 Total a pagar: $" + carrito.total());
    }
}