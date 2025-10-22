package modelo;

public class Usuario {
    private static int contador = 1;
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private String rol;

    public Usuario(String nombre, String apellido, String usuario, String contrasena, String rol) {
        this.idUsuario = contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getIdUsuario() { return idUsuario; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getUsuario() { return usuario; }
    public String getRol() { return rol; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    @Override
    public String toString() {
        return idUsuario + " - " + nombre + " " + apellido + " (" + rol + ")";
    }
}
