import java.util.Scanner;

public class ImpuestoRenta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBase, salarioDeducciones, impuestoRenta;
        int numHijos;
        System.out.println("Introduzca su salario base anual.");
        salarioBase = sc.nextDouble();
        // Se pregunta el número de hijos para poder calcular las deducciones
        System.out.println("Introduzca el número de hijos.");
        numHijos = sc.nextInt();

        if (numHijos == 1 || numHijos == 2) {
            salarioDeducciones = salarioBase - salarioBase * 0.05;
        } else if (numHijos > 2) {
            salarioDeducciones = salarioBase - salarioBase * 0.15;
        } else {
            salarioDeducciones = salarioBase;
        }
        impuestoRenta = salarioDeducciones * 0.15;
        System.out.println("La base imponible es: " + salarioDeducciones);
        System.out.println("Tiene que pagar " + impuestoRenta + " de impuesto de la renta");

    }

}
