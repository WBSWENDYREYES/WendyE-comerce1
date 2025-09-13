package CapaDatabase;

public class ProductoDigital extends Producto {
    private String formatoArchivo;
    private double tamanoMB;

    public ProductoDigital(int idproducto, String referencia,  String descripcion, String descripampliada, double precio, int existencia,
                           String formatoArchivo, double tamanoMB) 
    {
    	super(idproducto, referencia, descripcion, descripampliada, precio, existencia);
    	this.formatoArchivo = formatoArchivo;
        this.tamanoMB = tamanoMB;
    }

    public String getFormatoArchivo() { return formatoArchivo; }
    public double gtTamanoMB() { return tamanoMB; }


}