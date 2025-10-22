Seminario de Práctica de Informática – Universidad Siglo 21
Alumno: Agustín Tiziano Greco
Año: 2025

📘 Descripción general

El presente trabajo práctico consiste en el desarrollo de un sistema de gestión de ventas en lenguaje Java, basado en los requerimientos y modelos de datos implementados en los TP1 y TP2.
El objetivo principal es aplicar los conceptos de Programación Orientada a Objetos (POO), incluyendo encapsulamiento, herencia, polimorfismo, abstracción, y la correcta utilización de estructuras de control, manejo de excepciones y creación de objetos.

⚙️ Funcionalidades principales

El sistema permite realizar las siguientes operaciones:

Gestión de usuarios

Registrar, modificar y eliminar usuarios.

Roles: Administrador o Vendedor.

Gestión de clientes

Registrar nuevos clientes con nombre, apellido, email y teléfono.

Gestión de productos

Registrar, modificar y eliminar productos con sus atributos (ID, nombre, categoría, precio y stock).

Registro de ventas

Registrar una venta asociando cliente, productos vendidos, cantidad y precio total.

Descontar automáticamente el stock de los productos vendidos.

Reportes de ventas

Consultar reportes de ventas generados y listar resultados por rango de fechas.

Menú de selección

Interfaz de consola que permite al usuario seleccionar opciones y navegar por las funcionalidades del sistema.

🧠 Estructura del proyecto
src/
 └─ app/
     ├─ Main.java
     ├─ modelo/
     │   ├─ Cliente.java
     │   ├─ DetalleVenta.java
     │   ├─ Producto.java
     │   ├─ Reporte.java
     │   ├─ Usuario.java
     │   └─ Venta.java
     └─ servicio/
         ├─ GestorClientes.java
         ├─ GestorProductos.java
         ├─ GestorReportes.java
         ├─ GestorUsuarios.java
         └─ GestorVentas.java


Paquete modelo: Contiene las clases base que representan las entidades del sistema.

Paquete servicio: Implementa los gestores que manipulan los datos y ejecutan la lógica del negocio.

Main.java: Clase principal que ejecuta el menú y coordina la interacción entre gestores y entidades.

🧩 Conceptos aplicados

Encapsulamiento: atributos privados y métodos públicos de acceso.

Abstracción: separación de responsabilidades mediante capas (modelo y servicio).

Polimorfismo y herencia: uso de clases y métodos que permiten extender y modificar comportamientos.

Manejo de excepciones: control de errores al ingresar datos por teclado.

Estructuras de control: condicionales y bucles en la lógica de menú y validación.

💻 Ejecución del programa

Clonar el repositorio:

git clone https://github.com/agustingreco2020/TP3_PymesVentas.git


Abrir el proyecto en Eclipse IDE o IntelliJ IDEA.

Compilar y ejecutar la clase:

src/app/Main.java

📊 Conclusión

El desarrollo permitió aplicar en Java los conceptos teóricos vistos durante la materia, integrando la gestión de datos y las estructuras de control con un enfoque orientado a objetos.
El resultado es un prototipo funcional que reproduce la lógica del sistema de ventas diseñado en los trabajos prácticos anteriores.
