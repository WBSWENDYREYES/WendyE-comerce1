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
