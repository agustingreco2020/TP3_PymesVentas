package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class GestorVentas {
    private List<Venta> ventas = new ArrayList<>();

    public void agregarDetalleVenta(Venta venta, int idProducto, int cantidad, GestorProductos gestorProductos) {
        Producto producto = gestorProductos.buscarProducto(idProducto);
        if (producto == null) {
            System.out.println("⚠️ Producto no encontrado.");
            return;
        }
        if (producto.getStock() < cantidad) {
            System.out.println("⚠️ Stock insuficiente.");
            return;
        }

        producto.setStock(producto.getStock() - cantidad);
        DetalleVenta detalle = new DetalleVenta(producto, cantidad);
        venta.agregarDetalle(detalle);
        System.out.println("🧾 Agregado: " + detalle);
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
        System.out.println("✅ Venta registrada: " + venta);
    }

    public List<Venta> getVentas() {
        return ventas;
    }
}
