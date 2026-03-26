public class Cliente {
    private String nombre;
    private String correo;
    private double saldo;
    private int totalCompras;

    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
        this.totalCompras = 0;
    }

    public void mostrarPerfil() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Saldo: $" + String.format("%.2f", saldo));
        System.out.println("Compras realizadas: " + totalCompras);
    }

    public void realizarCompra(double monto) {
        if (saldo >= monto) {
            saldo = saldo - monto;
            totalCompras++;
            System.out.println("Compra exitosa por $" + String.format("%.2f", monto));
            System.out.println("Saldo restante: $" + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo actual: $" + String.format("%.2f", saldo));
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + String.format("%.2f", saldo));
    }
}