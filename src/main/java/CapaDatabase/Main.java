package CapaDatabase;

public class Main {

		
		 public static void mostrarDetallesProducto(Producto p) {
		        System.out.println(p.getDetalles());
		    }

		    public static void main(String[] args) {
		        Producto p1 = new ProductoDigital(1, "099098", "LIBRO PROGRAMACION ORIENTADA A OBJETOS", "DETALLE AMPLIADO DEL LIBRE WWW.LIBRO.COM", 15.99,10, "PDF",2.5);
		        Producto p2 = new ProductoFisico(2, "099098", "DISCO DURO", "DETALLE AMPLIADO DEL LIBRE WWW.LIBRO.COM", 15.99, 10, 1.0, "1 X 6 CM");
			 
		        // Usamos polimorfismo
		        mostrarDetallesProducto(p1);
		        mostrarDetallesProducto(p2);
		    }

	

}
