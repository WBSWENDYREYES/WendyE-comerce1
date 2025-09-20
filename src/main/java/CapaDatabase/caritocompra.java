package CapaDatabase;
import java.util.ArrayList;

public class caritocompra {

	// Atributos
    private ArrayList<Producto> productos;
    private double total;

    // Constructor
    public caritocompra() {
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    // Método para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        calcularTotal();
    }

    public void agregarProducto(int idproducto,String referencia, String descripcion, String descripampliada) {
        Producto nuevo = new Producto(idproducto,referencia,descripcion,descripampliada, 10, 20);
        productos.add(nuevo);
        total += nuevo.getPrecio();
    }

    // 🔹 Versión 3: Agregar producto solo por nombre y precio
    public void agregarProducto(String descripcion, double precio) {
        // ID genérico autogenerado usando el tamaño de la lista
        Producto nuevo = new Producto(productos.size() + 1, "ref#", descripcion, "", precio, 1);
        productos.add(nuevo);
        total += nuevo.getPrecio();
    }

    // 🔹 Versión 4: Agregar múltiples productos (array)
    public void agregarProducto(Producto[] listaProductos) {
        for (Producto p : listaProductos) {
            productos.add(p);
            total += p.getPrecio();
        } 
    }
    
    // Método para remover un producto
    public void removerProducto(Producto producto) {
        productos.remove(producto);
        calcularTotal();
    }

    // Método para calcular el total
    private void calcularTotal() {
        total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
    }

    // Getter para obtener lista de productos
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Getter para el total
    public double getTotal() {
        return total;
    }

}
