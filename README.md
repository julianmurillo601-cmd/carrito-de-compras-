# 🛒 Carrito de Compras en Java (POO)

## 📌 Descripción General

Este proyecto consiste en el desarrollo de una aplicación en Java que simula el funcionamiento básico de un **carrito de compras**, aplicando los principios de la **Programación Orientada a Objetos (POO)**.

El sistema permite:

* Crear productos con nombre, precio y stock.
* Realizar ventas validando disponibilidad.
* Agregar productos a un carrito de compras.
* Listar los productos agregados.
* Calcular el total a pagar.

---

## 🎯 Objetivos del Proyecto

* Aplicar conceptos de POO en Java.
* Implementar clases, atributos y métodos.
* Utilizar estructuras dinámicas como `ArrayList`.
* Manejar validaciones básicas en procesos de compra.
* Organizar el código de forma modular y reutilizable.

---

## 🧱 Estructura del Proyecto

El proyecto está compuesto por tres clases principales:

### 1. `Producto.java`

Representa un producto dentro del sistema.

#### Atributos:

* `nombre`: nombre del producto.
* `precio`: valor del producto.
* `stock`: cantidad disponible.

#### Métodos principales:

* `vender(int cantidad)`: reduce el stock si hay disponibilidad.
* `mostrarProducto()`: retorna la información del producto.

---

### 2. `Carrito.java`

Representa el carrito de compras.

#### Atributos:

* `ArrayList<Producto> productos`: lista de productos agregados.

#### Métodos principales:

* `agregarProducto(Producto producto)`: añade un producto al carrito.
* `listar()`: muestra los productos en el carrito.
* `total()`: calcula el valor total de la compra.

---

### 3. `App.java`

Clase principal donde se ejecuta el programa.

#### Funcionalidades:

* Creación de productos.
* Uso de constructores (vacío y con parámetros).
* Simulación de ventas.
* Agregar productos al carrito.
* Mostrar resultados en consola.

---

## ⚙️ Funcionalidades Clave

### ✅ Creación de Productos

Se pueden crear productos usando:

* Constructor con parámetros.
* Constructor vacío + setters.

### ✅ Validación de Ventas

El método `vender()` controla:

* Cantidades inválidas.
* Falta de stock.
* Actualización del inventario.

### ✅ Carrito de Compras

Permite:

* Agregar múltiples productos.
* Visualizar la lista de compra.
* Calcular el total automáticamente.

---

## 🧠 Conceptos de Programación Aplicados

* Encapsulamiento (atributos privados + getters/setters)
* Constructores
* Métodos personalizados
* Listas dinámicas (`ArrayList`)
* Validación de datos
* Separación de responsabilidades (clases independientes)

---

## ▶️ Ejecución del Programa

1. Compilar las clases:

```bash
javac com/ejerciciosena/*.java
```

2. Ejecutar la aplicación:

```bash
java com.ejerciciosena.App
```

---

## 💡 Ejemplo de Salida

```
✅ Venta realizada de 2 unidad(es) de Laptop
❌ Error: no hay suficiente stock

🛒 PRODUCTOS EN EL CARRITO:
Producto: Laptop
Precio: $2500000
Stock: 3
------------------------
💰 Total a pagar: $...
```

---

## 🚀 Posibles Mejoras

* Agregar cantidades por producto en el carrito.
* Implementar eliminación de productos.
* Crear interfaz gráfica (GUI).
* Persistencia de datos (archivos o base de datos).
* Manejo de usuarios o clientes.

---

## 👨‍💻 Autor

Julian David Murillo Puentes - 3311976

---

## 📚 Conclusión

Esta iniciativa facilita el aprendizaje sobre la estructuración de aplicaciones reales mediante la Programación Orientada a Objetos. Al recrear un sistema de compras esencial, se adquieren competencias clave para el desarrollo de software actual.