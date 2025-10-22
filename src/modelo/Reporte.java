package modelo;

public class Reporte {
    private static int contador = 1;
    private int idReporte;
    private String tipo;
    private double total;

    public Reporte(String tipo, double total) {
        this.idReporte = contador++;
        this.tipo = tipo;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reporte #" + idReporte + " - Tipo: " + tipo + " | Total: $" + total;
    }
}
