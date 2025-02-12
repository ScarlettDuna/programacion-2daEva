public class PlazoFijo extends Cuenta{
    int plazofijo;
    double interes;
    PlazoFijo(String titular, float cantidad, int plazofijo, double interes){
        super(titular, cantidad);
        this.plazofijo = plazofijo;
        this.interes = interes;
    }
    public double calcularInteres() {
        double ganancias = cantidad * (interes / 100);
        System.out.println("Interés ganado: " + ganancias + " €.");
        return ganancias;
    }
    @Override
    public void imprimirSaldo() {
        System.out.println("En la cuenta de " + this.titular + " hay: " + this.cantidad + "€. Y tiene un plazo fijo de " + this.plazofijo + " días y un interés de " + this.interes + "%. \nEl importe del interes es: " + this.calcularInteres() + "€");
    }
}
