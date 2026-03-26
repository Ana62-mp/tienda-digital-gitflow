public class Main {
    public static void main(String[] args) {
        System.out.println("===== Bienvenido a la Tienda Digital =====");
        System.out.println();

        // Integrante 1: Producto
        Producto producto1 = new Producto("Audífonos Bluetooth", 89.99, 50, "Electrónica");
        producto1.mostrarInfo();
        producto1.aplicarDescuento(15.0);
        producto1.verificarStock(20);

        System.out.println();

        // Integrante 2: Cliente
        Cliente cliente1 = new Cliente("María López", "maria@email.com", 250.00);
        cliente1.mostrarPerfil();
        cliente1.realizarCompra(89.99);
        cliente1.mostrarSaldo();

        System.out.println();

        // Integrante 3: Carrito
        Carrito carrito1 = new Carrito("María López");
        carrito1.agregarProducto("Audífonos Bluetooth", 89.99);
        carrito1.agregarProducto("Cargador USB", 15.00);
        carrito1.calcularTotal();
        carrito1.mostrarResumen();

        System.out.println();

        // Integrante 4: Tienda (opcional)
        Tienda tienda1 = new Tienda("Tech Store");
        tienda1.registrarProducto("Audífonos Bluetooth");
        tienda1.registrarProducto("Cargador USB");
        tienda1.registrarProducto("Mouse Gamer");
        tienda1.buscarProducto("Cargador USB");
        tienda1.generarReporte();

        System.out.println();
        System.out.println("===== Fin del programa =====");
    }
}