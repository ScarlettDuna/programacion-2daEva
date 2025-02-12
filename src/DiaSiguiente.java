import java.util.Scanner;

public class DiaSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día");
        // Creamos un primer control para que no se introduzcan número negativos o superiores al número habitual de días y meses
        int day = sc.nextInt();
        while (day < 1 || day > 31) {
            System.out.println("Día no válido, introduce un número del 1 al 31");
            day = sc.nextByte();
        }
        System.out.println("Introduce un mes (número del 1 al 12)");
        int month = sc.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("Mes no válido, introduce un número del 1 al 12");
            month = sc.nextByte();
        }
        System.out.println("Introduce un año");
        int year = sc.nextInt();
        while (year < 0) {
            System.out.println("Año no válido, introduce un número positivo");
            year = sc.nextByte();
        }
        // Para calcular si el año es bisiesto o no
        boolean esBisiesto = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                esBisiesto = year % 400 == 0;
            } else {
                esBisiesto = true;
            }
        }
        // Empezamos a sumar el día
        // Creamos segundo control en caso de que el número de días no corresponda con el mes
        // Fechas incorrectas como 31 de abril o 30 de febrero
        boolean diaCorrecto = true;
        day += 1;
        if (day >= 29) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    // tienen 31 dias
                    if (day == 32) {
                        month += 1;
                        day = 1;
                    }
                    break;
                case 2:
                    // depende de si es bisiesto, tiene 28 o 29
                    if (esBisiesto) {
                        if (day == 30) {
                            month += 1;
                            day = 1;
                        } else if (day > 30) {
                            diaCorrecto = false;
                        }
                    } else {
                        if (day == 29) {
                            month += 1;
                            day = 1;
                        } else {
                            diaCorrecto = false;
                        }
                    }
                    break;
                case 4, 6, 9, 11:
                    // tienen 30 dias
                    if (day == 31) {
                        month += 1;
                        day = 1;
                    } else if (day == 32) {
                        diaCorrecto = false;
                    }
                    break;
            }
        }
        if (!diaCorrecto) {
            System.out.println("Fecha incorrecta. Empieza de nuevo");
        } else {
            if (month == 13) {
                month = 1;
                year += 1;
            }
            System.out.println("El día siguiente es: " + day + "-" + month + "-" + year + ".");
        }
    }
}
