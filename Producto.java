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

}
