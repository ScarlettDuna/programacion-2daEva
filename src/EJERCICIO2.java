import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        double capitalInicial, capitalFinal, ahorro;
        double interes;
        int periodoAhorro = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es el capital inicial?");
        capitalInicial = scanner.nextDouble();
        System.out.println("¿Cuál es el interés?");
        interes = scanner.nextDouble();
        interes /= 100;
        ahorro = capitalInicial;

        for (;;) {
            capitalFinal = ahorro * (1 + interes);
            System.out.println("El capital del mes: " + (periodoAhorro) + " pasa a : " + capitalFinal + " euros.");
            if (capitalFinal > capitalInicial * 2) { break; };
            ahorro = capitalFinal;
            periodoAhorro ++;
        }
    }
}
