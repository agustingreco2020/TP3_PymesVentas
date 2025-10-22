package modelo;

public class Cliente {
    private static int contador = 1;
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Cliente(String nombre, String apellido, String email, String telefono) {
        this.idCliente = contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdCliente() { return idCliente; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return idCliente + " - " + nombre + " " + apellido + " | " + email + " | " + telefono;
    }
}
