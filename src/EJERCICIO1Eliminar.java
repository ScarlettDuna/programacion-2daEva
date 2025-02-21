import java.io.*;
import java.util.Scanner;

public class EJERCICIO1Eliminar {
    public static void main(String[] args) throws IOException {
        File fruteriaArantxa = new File("Fruteria_Arantxa.dat");
        RandomAccessFile file = new RandomAccessFile(fruteriaArantxa, "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el código del producto a eliminar en el caso de no querer eliminar introduzca el código 0");
        int codProducto = scanner.nextInt();
        if (codProducto == 0) {
            return;
        }
        long posicion = (codProducto - 1) * 73;
        System.out.println("¿Qué tipo de borrado quieres: lógico (1) o físico (2)");
        int menu = scanner.nextInt();
        if (menu == 1) {
            posicion += 69;
            file.seek(posicion);
            file.writeInt(1);
            System.out.println("Borrado lógico realizado con éxito.");
        } else if (menu == 2) {
            posicion += 69;
            file.seek(posicion);
            file.writeInt(-1);
            System.out.println("Borrado físico realizado con éxito.");
        } else {
            System.out.println("Opción inválida");
            return;
        }
        System.out.println("=================\\LISTADO DE PRODUCTOS\\ =============");

    }
}
