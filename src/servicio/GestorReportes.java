package servicio;

import modelo.Reporte;
import modelo.Venta;

public class GestorReportes {
    public void generarReporte(GestorVentas gestorVentas) {
        double total = gestorVentas.getVentas().stream().mapToDouble(Venta::calcularTotal).sum();
        Reporte reporte = new Reporte("Ventas totales", total);
        System.out.println("📊 " + reporte);
    }
}
