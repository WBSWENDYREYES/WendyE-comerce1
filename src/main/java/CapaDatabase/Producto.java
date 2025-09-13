package CapaDatabase;

public class Producto {

	private int idproducto;
    private String referencia;
    private String descripcion;
    private String descripampliada;
    private double precio;
    private int existencia;

    // Constructor
    public Producto(int idproducto,String referencia, String descripcion, String descripampliada, double precio, int existencia) {
        this.idproducto = idproducto;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.descripampliada = descripampliada;
        this.precio = precio;
        this.existencia = existencia;
    }
    // Métodos (Propiedades)
    public int getidproducto () {
        return idproducto;
    }
    public void setidproducto (int idproducto) {
        this.idproducto = idproducto;
    }
    public String getReferencia() {
        return referencia;
    }    
    public void setReferencia(String referencia) {
    	this.referencia = referencia;
    }   
public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
public String getDescripampliada() {
        return descripampliada;
    }
    public void setDescripampliada (String descripampliada) {
        this.descripampliada = descripampliada;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }


	

}
