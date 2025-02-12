import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos artículos desea introducir en su factura?");
        int longLista = sc.nextInt();
        int [] listaPrecios = new int[longLista];
        int [] listaIvas = new int[longLista];
        double [] preciosConIva = new double[longLista];
        double total = 0;
        double totalConDescuento;

        for (int i = 0; i < longLista; i++) {
            System.out.println("Introduzca importe");
            listaPrecios[i] = sc.nextInt();
            System.out.println("Introduzca el iva correspondiente");
            listaIvas[i] = sc.nextInt();

        }

        for (int i = 0; i < longLista; i++) {
            preciosConIva[i] = listaPrecios[i] + (listaPrecios[i] * listaIvas[i] * 0.01);
            total += preciosConIva[i];
        }
        System.out.println("El importe total sin descuento es " + total);

        if (total < 1000) {
            totalConDescuento = total;
        } else if (total >= 1000 && total < 10000) {
            totalConDescuento = total + total * 0.05;
        } else {
            totalConDescuento = total + total * 0.1;
        }
        System.out.println("El importe total con descuento es " + totalConDescuento);
    }
}
