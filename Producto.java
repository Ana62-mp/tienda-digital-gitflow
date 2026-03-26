public class Producto {
    // Atributos privados según el estándar POO [cite: 87, 93]
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    // Constructor que asigna los parámetros con 'this' [cite: 33, 94]
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

    // Calcula descuento sin modificar el atributo precio [cite: 36]
    public void aplicarDescuento(double porcentaje) {
        double montoDescontado = precio * (porcentaje / 100);
        double precioFinal = precio - montoDescontado;
        
        System.out.println("Descuento del " + porcentaje + "%: -$" + montoDescontado);
        System.out.println("Precio con descuento: $" + precioFinal);
    }

    // Verifica disponibilidad comparando con el stock actual [cite: 36]
    public void verificarStock(int cantidad) {
        if (cantidad <= stock) {
            System.out.println("Disponible: " + stock);
        } else {
            System.out.println("Stock insuficiente.");
            System.out.println("Disponible: " + stock);
        }
    }
}
