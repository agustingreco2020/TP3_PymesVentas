package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

public class GestorProductos {
    private List<Producto> productos = new ArrayList<>();

    public void registrarProducto(Producto p) {
        productos.add(p);
        System.out.println("✅ Producto registrado: " + p);
    }

    public Producto buscarProducto(int id) {
        return productos.stream().filter(p -> p.getIdProducto() == id).findFirst().orElse(null);
    }

    public void modificarProducto(int id, String nuevoNombre, int nuevoStock) {
        Producto p = buscarProducto(id);
        if (p != null) {
            p.setNombre(nuevoNombre);
            p.setStock(nuevoStock);
            System.out.println("✅ Producto actualizado: " + p);
        } else {
            System.out.println("⚠️ Producto no encontrado.");
        }
    }

    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getIdProducto() == id);
        System.out.println("🗑️ Producto eliminado (si existía).");
    }

    public void listarProductos() {
        if (productos.isEmpty()) System.out.println("⚠️ No hay productos.");
        else productos.forEach(System.out::println);
    }
}
