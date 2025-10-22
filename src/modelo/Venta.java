package modelo;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private static int contador = 1;
    private int idVenta;
    private int idCliente;
    private int idUsuario;
    private List<DetalleVenta> detalles = new ArrayList<>();

    public Venta(int idCliente, int idUsuario) {
        this.idVenta = contador++;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {
        return detalles.stream().mapToDouble(DetalleVenta::getSubtotal).sum();
    }

    public int getIdVenta() { return idVenta; }
    public int getIdCliente() { return idCliente; }
    public List<DetalleVenta> getDetalles() { return detalles; }

    @Override
    public String toString() {
        return "Venta #" + idVenta + " - Cliente ID: " + idCliente + " | Total: $" + calcularTotal();
    }
}
