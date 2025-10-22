package modelo;

public class Producto {
    private static int contador = 1;
    private int idProducto;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.idProducto = contador++;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdProducto() { return idProducto; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return idProducto + " - " + nombre + " | " + categoria + " | $" + precio + " | Stock: " + stock;
    }
}
