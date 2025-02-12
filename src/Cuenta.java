public class Cuenta {
    String titular;
    float cantidad;
    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public void imprimirSaldo() {
        System.out.println("En la cuenta de " + this.titular + " hay: " + this.cantidad + "€");
    }

    public static void main(String[] args) {
        CajaAhorro caja1 = new CajaAhorro("Manuel", 5000);
        caja1.imprimirSaldo();

        PlazoFijo plazo1 = new PlazoFijo("Isabel", 8000, 365, 1.2);
        plazo1.imprimirSaldo();

    }
}
