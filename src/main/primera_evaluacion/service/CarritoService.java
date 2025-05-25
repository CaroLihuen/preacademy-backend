package main.primera_evaluacion.service;

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
     Producto televisor = new Producto().iD(1).nombre("Televisor Phillip 52'").precio(750000).categoria("electrodomestico");
     
     System.out.println(televisor);
     televisor.nombre("Televisor Phillip 72'");
     System.out.println(televisor);
     
    }

}
