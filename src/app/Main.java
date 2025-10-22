package app;

import java.util.Scanner;

import modelo.*;
import servicio.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicialización de gestores
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        GestorClientes gestorClientes = new GestorClientes();
        GestorProductos gestorProductos = new GestorProductos();
        GestorVentas gestorVentas = new GestorVentas();
        GestorReportes gestorReportes = new GestorReportes();

        // Datos iniciales
        gestorUsuarios.registrarUsuario(new Usuario("Ana", "Gómez", "agomez", "1234", "Administrador"));
        gestorUsuarios.registrarUsuario(new Usuario("Carlos", "López", "clopez", "5678", "Vendedor"));
        gestorProductos.registrarProducto(new Producto("Monitor", "Electrónica", 80000, 10));
        gestorProductos.registrarProducto(new Producto("Teclado", "Periféricos", 15000, 25));
        gestorClientes.registrarCliente(new Cliente("Pedro", "Martínez", "pedro@mail.com", "11335577"));
        gestorClientes.registrarCliente(new Cliente("Lucía", "Fernández", "lucia@mail.com", "11774455"));

        int opcion;
        do {
            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("1. Gestionar Usuarios");
            System.out.println("2. Gestionar Clientes");
            System.out.println("3. Gestionar Productos");
            System.out.println("4. Registrar Venta");
            System.out.println("5. Listar Ventas");
            System.out.println("6. Generar Reporte de Ventas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n--- GESTIÓN DE USUARIOS ---");
                    System.out.println("1. Registrar usuario");
                    System.out.println("2. Modificar usuario");
                    System.out.println("3. Eliminar usuario");
                    System.out.print("Seleccione una opción: ");
                    int sub = sc.nextInt(); sc.nextLine();

                    switch (sub) {
                        case 1 -> {
                            System.out.print("Nombre: ");
                            String nom = sc.nextLine();
                            System.out.print("Apellido: ");
                            String ape = sc.nextLine();
                            System.out.print("Usuario: ");
                            String usr = sc.nextLine();
                            System.out.print("Contraseña: ");
                            String pass = sc.nextLine();
                            System.out.print("Rol: ");
                            String rol = sc.nextLine();
                            gestorUsuarios.registrarUsuario(new Usuario(nom, ape, usr, pass, rol));
                        }
                        case 2 -> {
                            System.out.print("ID de usuario a modificar: ");
                            int id = sc.nextInt(); sc.nextLine();
                            System.out.print("Nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            System.out.print("Nuevo apellido: ");
                            String nuevoApellido = sc.nextLine();
                            gestorUsuarios.modificarUsuario(id, nuevoNombre, nuevoApellido);
                        }
                        case 3 -> {
                            System.out.print("ID de usuario a eliminar: ");
                            int id = sc.nextInt();
                            gestorUsuarios.eliminarUsuario(id);
                        }
                        default -> System.out.println("⚠️ Opción inválida.");
                    }
                }

                case 2 -> {
                    System.out.println("\n--- GESTIÓN DE CLIENTES ---");
                    System.out.println("1. Registrar cliente");
                    System.out.println("2. Listar clientes");
                    System.out.print("Seleccione una opción: ");
                    int sub = sc.nextInt(); sc.nextLine();

                    if (sub == 1) {
                        System.out.print("Nombre: ");
                        String nom = sc.nextLine();
                        System.out.print("Apellido: ");
                        String ape = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Teléfono: ");
                        String tel = sc.nextLine();
                        gestorClientes.registrarCliente(new Cliente(nom, ape, email, tel));
                    } else if (sub == 2) {
                        gestorClientes.listarClientes();
                    } else {
                        System.out.println("⚠️ Opción inválida.");
                    }
                }

                case 3 -> {
                    System.out.println("\n--- GESTIÓN DE PRODUCTOS ---");
                    System.out.println("1. Registrar producto");
                    System.out.println("2. Modificar producto");
                    System.out.println("3. Eliminar producto");
                    System.out.println("4. Listar productos");
                    System.out.print("Seleccione una opción: ");
                    int sub = sc.nextInt(); sc.nextLine();

                    switch (sub) {
                        case 1 -> {
                            System.out.print("Nombre: ");
                            String nom = sc.nextLine();
                            System.out.print("Categoría: ");
                            String cat = sc.nextLine();
                            System.out.print("Precio: ");
                            double precio = sc.nextDouble();
                            System.out.print("Stock: ");
                            int stock = sc.nextInt();
                            gestorProductos.registrarProducto(new Producto(nom, cat, precio, stock));
                        }
                        case 2 -> {
                            System.out.print("ID de producto a modificar: ");
                            int id = sc.nextInt(); sc.nextLine();
                            System.out.print("Nuevo nombre: ");
                            String nuevoNombre = sc.nextLine();
                            System.out.print("Nuevo stock: ");
                            int nuevoStock = sc.nextInt();
                            gestorProductos.modificarProducto(id, nuevoNombre, nuevoStock);
                        }
                        case 3 -> {
                            System.out.print("ID de producto a eliminar: ");
                            int id = sc.nextInt();
                            gestorProductos.eliminarProducto(id);
                        }
                        case 4 -> gestorProductos.listarProductos();
                        default -> System.out.println("⚠️ Opción inválida.");
                    }
                }

                case 4 -> {
                    System.out.println("\n--- REGISTRAR VENTA ---");
                    System.out.print("ID Cliente: ");
                    int idCliente = sc.nextInt();
                    System.out.print("ID Usuario (Vendedor): ");
                    int idUsuario = sc.nextInt();
                    Venta venta = new Venta(idCliente, idUsuario);

                    String continuar;
                    do {
                        System.out.print("ID Producto: ");
                        int idProducto = sc.nextInt();
                        System.out.print("Cantidad: ");
                        int cant = sc.nextInt();
                        gestorVentas.agregarDetalleVenta(venta, idProducto, cant, gestorProductos);
                        System.out.print("¿Agregar otro producto? (s/n): ");
                        continuar = sc.next();
                    } while (continuar.equalsIgnoreCase("s"));

                    gestorVentas.registrarVenta(venta);
                }

                case 5 -> {
                    System.out.println("\n--- LISTADO DE VENTAS ---");
                    for (Venta v : gestorVentas.getVentas()) {
                        System.out.println(v);
                        v.getDetalles().forEach(d -> System.out.println("   " + d));
                    }
                }

                case 6 -> gestorReportes.generarReporte(gestorVentas);

                case 0 -> System.out.println("👋 Saliendo del sistema. ¡Gracias!");
                default -> System.out.println("⚠️ Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
