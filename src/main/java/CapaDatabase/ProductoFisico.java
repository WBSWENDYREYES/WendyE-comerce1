package CapaDatabase;

public class ProductoFisico extends Producto {
    private double pesoKg;
    private String dimensiones;

    public ProductoFisico(int id, String nombre, String descripcion, double precio, int stock,
                          double pesoKg, String dimensiones) {
        super(idproducto, referencia,descripcion,descripampliada,precio,existencia);
        this.pesoKg = pesoKg;
        this.dimensiones = dimensiones;
    }

    public double getPesoKg() { return pesoKg; }
    public String getDimensiones() { return dimensiones; }

  
}
