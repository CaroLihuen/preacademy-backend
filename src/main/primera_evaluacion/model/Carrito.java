package main.primera_evaluacion.model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
  List<ItemCarrito> items;
  Cupon cupon;
  Cliente cliente;

  /*
   * Atributos: List<ItemCarrito> items, Cupon cupon, Cliente cliente.
   * Implementar las siguientes funcionalidades:
   * gi
   * Dentro de la clase debe incluirse un método que calcule el descuento final
   * aplicable:
   * Si hay un cupón, se usa su porcentaje.
   * Si no hay cupón, aplicar:
   * 10% si el total supera $10.000
   * 5% si el total supera $5.000
   * 0% si no se supera ninguno de esos montos
   */

  // void agregarProducto(Producto producto, int cantidad): Agrega un nuevo
  // producto al carrito con la cantidad indicada.
  // Si el producto ya existe en el carrito, se debe incrementar su cantidad.
  public Carrito(List<ItemCarrito> items, Cupon cupon, Cliente cliente) {
    this.items = items;
    this.cupon = cupon;
    this.cliente = cliente;
  }

  public void agregarProducto(Producto producto, int cantidad) {
    for (int i = 0; i < items.size(); i++) {
      ItemCarrito item = items.get(i);
      if (item.getProducto().getId() == producto.getId()) {
        cantidad += 1;
        item.setCantidad(item.getCantidad() + cantidad);
        return;
      }
    }
    cantidad += 1;
    items.add(new ItemCarrito(producto, cantidad));

  }

  public void quitarProductoPorId(int idProducto) {
    // void quitarProductoPorId(int idProducto): Elimina el producto del carrito que
    // coincida con el ID proporcionado
    // (si la cantidad es mayor a 1, se debe restar 1; si la cantidad es 1, se debe
    // eliminar el item del carrito).
    items.removeIf(item -> {
      if (item.getProducto().getId() == idProducto) {
        if (item.getCantidad() > 1) {
          item.setCantidad(item.getCantidad() - 1);
          return false;
        }
        return true;
      }
      return false;
    });
  }

  public void aplicarCupon(Cupon cupon) {
    // void aplicarCupon(Cupon cupon):asigna un cupón al carrito para que su
    // porcentaje de descuento sea considerado al calcular el total.
    this.cupon = cupon;
  }

  public double seAplicaCupon() {
    double descCupon = this.cupon.getPorcentajeDesc();
    double descAplicado;
    String change = Double.toString(descCupon); // Conversion porque no me deja aplicar double
    if (change != null) { // descCupon != null
      descAplicado = calcularSubtotal() * (descCupon / 100);
      return descAplicado;
    } else if (calcularSubtotal() > 10000) {
      descAplicado = calcularSubtotal() * 0.10;
      System.out.println("Se aplica descuento un %10 de descuento.");
      return descAplicado;
    } else if (calcularSubtotal() > 5000) {
      descAplicado = calcularSubtotal() * 0.05;
      System.out.println("Se aplica descuento un %5 de descuento.");
      return descAplicado;
    } else {
      descAplicado = calcularSubtotal();
      System.out.println("No se aplica descuento.");
      return descAplicado;
    }
  }

  public double calcularSubtotal() {
    // double calcularSubtotal(): Suma los subtotales de todos los ítems del carrito
    // sin aplicar ningún descuento.
    double subtotal = 0;
    for (int i = 0; i < items.size(); i++) {
      ItemCarrito item = items.get(i);
      subtotal += item.getCantidad() * item.getProducto().getPrecio();
    }
    return subtotal;
  }

  public double calcularTotalConDescuento() {
    // double calcularTotalConDescuento(): Calcula el total del carrito aplicando
    // los descuentos correspondientes, ya sea por cupón o por monto total.
    double subTotal = calcularSubtotal();
    double descuento = seAplicaCupon();
    double total = subTotal - descuento;
    return total;
  }

  public List<ItemCarrito> obtenerItemsPorCategoria(String categoria) {
    // Devuelve una lista de ítems cuyo producto pertenece a la categoría
    // especificada.
    List<ItemCarrito> prodPorCategoria = new ArrayList<>();
    for (int i = 0; i < this.items.size(); i++) {
      ItemCarrito item = this.items.get(i);
      if (item.getProducto().getCategoria().equalsIgnoreCase(categoria)) {
        prodPorCategoria.add(item);

        System.out.println("Los items por categoría son: ");
        for(int p = 0; p < prodPorCategoria.size(); p++){
        System.out.println(" - "+ prodPorCategoria.get(p).getProducto().getNombre());
       };
      } else{
        System.out.println("No existe esa categoria.");
      }
    }
    return prodPorCategoria;
  }

  public int obtenerCantidadTotalProductos() {
    // Devuelve la cantidad total de unidades de todos los productos en el carrito.
    int cantidadTotalProd = 0;
    for (int i = 0; i < items.size(); i++) {
      ItemCarrito item = items.get(i);
      cantidadTotalProd = item.getCantidad();
    }
    System.out.println("La cantidad total de productos es: "+cantidadTotalProd);
    return cantidadTotalProd;
  }

  public double obtenerPromedioPrecioProductos() {
    // Calcula el precio promedio de los productos contenidos en el carrito.
    if (items.isEmpty()) {
      System.err.println("No hay nada en el carrito.");
      ;
    }
    double promedioPrecio;
    int cantProductos = 0;
    double accumuladoPrecios = 0;
    for (int i = 0; i < items.size(); i++) {
      ItemCarrito item = items.get(i);
      accumuladoPrecios += item.getProducto().getPrecio() * item.getCantidad();
      cantProductos += item.getCantidad();
    }
    promedioPrecio = accumuladoPrecios / cantProductos;
    System.out.println("El promedio es "+ promedioPrecio );
    return promedioPrecio;
  }

  public void mostrarResumen() {
    double subtotal = calcularSubtotal();
    double totalDesc = calcularTotalConDescuento();
    double descuento = subtotal - totalDesc;

    System.out.println("--Resumen de la Compra--");
    // System.out.println("Cliente: "+ this.cliente);
    System.out.println("--Productos: --");
    for (int i = 0; i < items.size(); i++) {
      ItemCarrito item = items.get(i);
      System.out.println("--Resumen de la Compra--");
      System.out.println(" - " + item.getProducto().getNombre());
      System.out.println("  Cantidad: " + item.getCantidad());
      System.out.println("  Precio Unit.: $ " + item.getProducto().getPrecio());
      System.out.println("  SubTotal: $ " + (item.getCantidad() * item.getProducto().getPrecio()));
    }
    System.out.println("     ");
    System.out.println("-------------------------------");
    System.out.println("SubTotal: $ " + subtotal);
    System.out.println("Descuento: $ " + descuento);
    System.out.println("Toral: $ " + totalDesc);
    System.out.println("     ");
    System.out.println("     ");
    System.out.println("Gracias por su compra!");
  }
}
