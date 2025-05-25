package main.primera_evaluacion.model;

import java.util.List;

public class Carrito {
    List<ItemCarrito> items;
    Cupon cupon;
    Cliente cliente;

    /*Atributos: List<ItemCarrito> items, Cupon cupon, Cliente cliente.
Implementar las siguientes funcionalidades:
List<ItemCarrito> obtenerItemsPorCategoria(String categoria): Devuelve una lista de ítems cuyo producto pertenece a la categoría especificada.
int obtenerCantidadTotalProductos(): Devuelve la cantidad total de unidades de todos los productos en el carrito.
double obtenerPromedioPrecioProductos(): Calcula el precio promedio de los productos contenidos en el carrito.
void mostrarResumen(): Imprime por consola un resumen del contenido del carrito, incluyendo subtotal, descuentos, total, y detalle de productos.
Dentro de la clase debe incluirse un método que calcule el descuento final aplicable:
Si hay un cupón, se usa su porcentaje.
Si no hay cupón, aplicar:
10% si el total supera $10.000
5% si el total supera $5.000
0% si no se supera ninguno de esos montos
 */
   
   //void agregarProducto(Producto producto, int cantidad): Agrega un nuevo producto al carrito con la cantidad indicada. 
   //Si el producto ya existe en el carrito, se debe incrementar su cantidad.
   public void agregarProducto(Producto producto, int cantidad){
    for(int i = 0; i < items.size(); i++){ 
      ItemCarrito item = items.get(i);
      if(item.getProducto().getId() == producto.getId()){
        cantidad += 1;
        item.setCantidad(item.getCantidad() + cantidad);
        return;
      }
     }
    cantidad += 1;
    items.add(new ItemCarrito(producto, cantidad));
   
   }

   public void quitarProductoPorId(int idProducto){
    //void quitarProductoPorId(int idProducto): Elimina el producto del carrito que coincida con el ID proporcionado 
    //(si la cantidad es mayor a 1, se debe restar 1; si la cantidad es 1, se debe eliminar el item del carrito).
      items.removeIf(item -> {
        if(item.getProducto().getId() == idProducto){
          if(item.getCantidad()>1){
            item.setCantidad(item.getCantidad()-1);
            return false;
          }
          return true;
        }
        return false;
      });
   }
   
   public double calcularSubtotal(){
    //double calcularSubtotal(): Suma los subtotales de todos los ítems del carrito sin aplicar ningún descuento.
    double subtotal = 1; 
    return subtotal;
   }
   
   public double calcularTotalConDescuento(){
     //double calcularTotalConDescuento(): Calcula el total del carrito aplicando 
     //los descuentos correspondientes, ya sea por cupón o por monto total. 
     double totalDescuento = 1; 
     return totalDescuento;
   }

   public void aplicarCupon(Cupon cupon){
    //void aplicarCupon(Cupon cupon):asigna un cupón al carrito para que su porcentaje de descuento sea considerado al calcular el total.
   }
}
