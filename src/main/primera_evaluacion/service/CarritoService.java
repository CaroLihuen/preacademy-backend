package main.primera_evaluacion.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.primera_evaluacion.model.*;

public class CarritoService {
    /*
     Crear al menos 3 productos utilizando el patrón Builder
Crear un carrito y agregar productos
Aplicar un cupón de descuento
Calcular y mostrar:
Subtotal
Total con descuento
Items filtrados por categoría
Cantidad total de productos
Promedio de precios
Mostrar un resumen final en consola con los datos del carrito
Consideraciones
La lógica de negocio debe estar implementada dentro de la clase Carrito.
En los métodos de lógica, usar sentencias if para validaciones y condiciones.
Utilizar API Stream donde se considere adecuado (filtrado por categoría, cálculo de promedios, etc.).
Plus
[Desafío adicional - ordenamiento y comparación]
Sobrescribir el método compareTo() en la clase Producto para que compare los productos por precio (de menor a mayor).
Luego, en la clase Carrito, implementar un método:
List<Producto> obtenerProductosOrdenadosPorPrecio()
Este método debe devolver una lista con todos los productos del carrito ordenados por precio ascendente. Podés utilizar Collections.sort() o stream().sorted().
[Desafío adicional - sobreescritura de métodos]
También podés sobrescribir hashCode() y equals() en la clase Producto. Para el hashCode() podes usar Objects.hash(...) con los atributos id, nombre y precio. Para el equals() utiliza los mismos atributos.

     */
     public static void main(String[] args){ 

     //productos   
     Producto televisor = new Producto().iD(1).nombre("Televisor Phillip 52'").precio(750000).categoria("electrodomestico");
     Producto crema = new Producto().iD(2).nombre("Dermaglos Ultra").precio(250000).categoria("belleza");
     Producto heladera = new Producto().iD(3).nombre("Heladera Dream").precio(850000).categoria("electrodomestico");
     Producto reposera = new Producto().iD(4).nombre("Reposera Stella").precio(80000).categoria("jardín");

     System.out.println(televisor);
     televisor.nombre("Televisor Phillip 72'");
     System.out.println(televisor);
     
     //Items
     ItemCarrito itCarrito1 = new ItemCarrito(reposera, 0);
     ItemCarrito itCarrito2 = new ItemCarrito(crema, 3);
     
     itCarrito1.calcularSubtotal();
     itCarrito2.calcularSubtotal();

     List<ItemCarrito> items = new ArrayList<>();
     items.add(itCarrito1); 
     //Cupon
     Cupon cupon1 = new Cupon();
     cupon1.SetPorcentajeDesc(10);

     //Cliente
     
     Cliente user1 = new Cliente(1, "user1", "ASJ46KK","User One");
     
     
     //Carrito
     Carrito carrito1 = new Carrito( items, cupon1, user1);
     carrito1.agregarProducto(reposera,1);
     carrito1.obtenerCantidadTotalProductos();
     carrito1.calcularSubtotal();
     carrito1.calcularTotalConDescuento();
     carrito1.obtenerItemsPorCategoria("jardín");
     carrito1.obtenerItemsPorCategoria("Frios");
     //carrito1.mostrarResumen();
     //carrito1.obtenerPromedioPrecioProductos();
     //carrito1.obtenerCantidadTotalProductos();
    }

}
