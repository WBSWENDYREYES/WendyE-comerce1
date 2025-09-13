package CapaDatabase;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<String> historialCompras;
    private List<String> preferencias;

    public Cliente(int id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
        this.historialCompras = new ArrayList<>();
        this.preferencias = new ArrayList<>();
    }

    public void agregarCompra(String compra) {
        historialCompras.add(compra);
    }

    public void agregarPreferencia(String preferencia) {
        preferencias.add(preferencia);
    }

    public List<String> getHistorialCompras() {
        return historialCompras;
    }

    public List<String> getPreferencias() {
        return preferencias;
    }

   
}
