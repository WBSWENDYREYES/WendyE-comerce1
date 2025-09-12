package CapaDatabase;

public class Usuario {
    // Atributos
	    private int idusuario;
	    private String nombre;
	    private String correo;
	    private String contrasena;

	    //  Constructor
	    public Usuario(int idusuario, String nombre, String correo, String contrasena) {
	        this.idusuario = idusuario;
	        this.nombre = nombre;
	        this.correo = correo;
	        this.contrasena = contrasena;
	    }

	    
	    public int getIdusuario() {
	        return idusuario;
	    }

	    public void setIdusuario(int idusuario) {
	        this.idusuario = idusuario;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCorreo() {
	        return correo;
	    }

	    public void setCorreo(String correo) {
	        this.correo = correo;
	    }

	    public String getContrasena() {
	        return contrasena;
	    }

	    public void setContrasena(String contrasena) {
	        this.contrasena = contrasena;
	    }

}
