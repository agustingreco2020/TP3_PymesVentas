package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class GestorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario u) {
        usuarios.add(u);
        System.out.println("✅ Usuario registrado: " + u);
    }

    public void modificarUsuario(int id, String nuevoNombre, String nuevoApellido) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario() == id) {
                u.setNombre(nuevoNombre);
                u.setApellido(nuevoApellido);
                System.out.println("✅ Usuario actualizado: " + u);
                return;
            }
        }
        System.out.println("⚠️ Usuario no encontrado.");
    }

    public void eliminarUsuario(int id) {
        usuarios.removeIf(u -> u.getIdUsuario() == id);
        System.out.println("🗑️ Usuario eliminado (si existía).");
    }
}
