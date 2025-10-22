# TP3 - Sistema de Gestión y Análisis de Ventas

Seminario de Práctica de Informática - Universidad Siglo 21
Alumno: Agustín Tiziano Greco
Año: 2025

## 📘 Descripción general

El presente trabajo práctico consiste en el desarrollo de un sistema de gestión de ventas en lenguaje Java, basado en los requerimientos y modelos de datos implementados en los TP1 y TP2.
El objetivo principal es aplicar los conceptos de Programación Orientada a Objetos (POO), incluyendo encapsulamiento, herencia, polimorfismo, abstracción, y la correcta utilización de estructuras de control, manejo de excepciones y creación de objetos.

## 🧩 Estructura del proyecto

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

- Paquete modelo: Contiene las clases base que representan las entidades del sistema.
- Paquete servicio: Implementa los gestores que manipulan los datos y ejecutan la lógica del negocio.
- Main.java: Clase principal que ejecuta el menú y coordina la interacción entre gestores y entidades.

## ⚙️ Funcionalidades principales
El sistema permite realizar las siguientes operaciones:
- Registro y gestión de usuarios (administrador/vendedor).
- Registro de clientes.
- Registro, modificación y consulta de productos.
- Registro de ventas con actualización automática de stock.
- Generación de reportes de ventas por fecha y totales acumulados.

## 🧩 Tecnologías utilizadas
- Encapsulamiento: Atributos privados y métodos públicos de acceso.
- Abstracción: Separación de responsabilidades mediante capas (modelo y servicio).
- Polimorfismo y herencia: Uso de clases y métodos que permiten extender y modificar comportamientos.
- Manejo de excepciones: Control de errores al ingresar datos por teclado.
- Estructuras de control: Condiciones y bucles en la lógica de menú y validación.

## 🧠 Conceptos aplicados
- **Lenguaje:** Java SE 17  
- **IDE:** Eclipse IDE  
- **Paradigma:** Programación Orientada a Objetos (POO)
