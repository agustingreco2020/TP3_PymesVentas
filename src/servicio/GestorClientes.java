package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class GestorClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("✅ Cliente registrado: " + c);
    }

    public void listarClientes() {
        if (clientes.isEmpty()) System.out.println("⚠️ No hay clientes registrados.");
        else clientes.forEach(System.out::println);
    }
}

