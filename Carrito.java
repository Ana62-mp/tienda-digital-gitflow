public class Carrito {
    private String nombreCliente;
    private String[] productos;
    private double[] precios;
    private int cantidad;

    public Carrito(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.productos = new String[10];
        this.precios = new double[10];
        this.cantidad = 0;
    }

    public void agregarProducto(String nombre, double precio) {
        productos[cantidad] = nombre;
        precios[cantidad] = precio;
        cantidad = cantidad + 1;

        System.out.println("Producto agregado: " + nombre + " ($" + precio + ")");
    }

    public void calcularTotal() {
        double total = 0;

        for (int i = 0; i < cantidad; i++) {
            total = total + precios[i];
        }

        System.out.println("Total del carrito: $" + total);
    }

    public void mostrarResumen() {
        double total = 0;

        System.out.println("=== Carrito de " + nombreCliente + " ===");

        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            total = total + precios[i];
        }

        System.out.println("Total: $" + total);
    }
}