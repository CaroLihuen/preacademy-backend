package main.primera_evaluacion.model;
/*Atributos: Producto producto, int cantidad.
Implementar patrón constructor vacío, getters y setters.
Incluir patrón Builder dentro de la misma clase.
Método double calcularSubtotal(): precio * cantidad.
 */
public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(){

    }

    public ItemCarrito(Producto newProducto, int newCantidad){
        this.cantidad= newCantidad;
        this.producto= newProducto;
    }

    public ItemCarrito cantidad(int cantidad){
        cantidad= 1;
        this.cantidad = cantidad;
        return this;
    }

    public Producto getProducto(){
        return producto;
    }

    public void setProducto(Producto newProducto){
        producto = newProducto;  
    }/**/

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int newCantidad){
        cantidad = newCantidad;
    }

    public ItemCarrito producto(Producto producto){
        this.producto = producto;
        return this;
    }

    public double calcularSubtotal(){
        double subtotal;  
        subtotal = producto.getPrecio() * cantidad;
        return subtotal;
    }
    
}
