import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class MenuFichAleatorio {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué desea visualizar?");
        System.out.println("Para ver los empleados en activo, pulsa 1");
        System.out.println("Para ver los empleados borrados, pulsa 2");
        System.out.println("Para salir pulsa 0");
        int opcion = scanner.nextInt();
        while (opcion != 1 && opcion != 2 && opcion != 0) {
            System.out.println("Opción no valida");
            System.out.println("Para ver los empleados en activo, pulsa 1");
            System.out.println("Para ver los empleados borrados, pulsa 2");
            System.out.println("Para salir pulsa 0");
            opcion = scanner.nextInt();
        }

        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");
        int id, dep, posicion;
        Double salario;
        char[] apellido = new char[10];
        char aux;
        posicion = 0;

        if (opcion == 1) {
            for (; ; ) { //bucle infinito
                file.seek(posicion);
                id = file.readInt();
                for (int i = 0; i < apellido.length; i++) {
                    aux = file.readChar();
                    apellido[i] = aux;
                }
                String apellidos = new String(apellido);
                dep = file.readInt();
                salario = file.readDouble();
                if (id != 0) {
                    System.out.println("ID: " + id + ", Apellido: " + apellidos + ", Departamento: " +
                            dep + ", Salario: " + salario);
                }
                posicion += 36;
                if (file.getFilePointer() == file.length()) break;

            }

        } else if (opcion == 2) {
            for (; ; ) { //bucle infinito
                file.seek(posicion);
                id = file.readInt();
                for (int i = 0; i < apellido.length; i++) {
                    aux = file.readChar();
                    apellido[i] = aux;
                }
                String apellidos = new String(apellido);
                dep = file.readInt();
                salario = file.readDouble();
                if (id == 0 && dep != 0) {
                    System.out.println("ID: " + id + ", Apellido: " + apellidos + ", Departamento: " +
                            dep + ", Salario: " + salario);
                }
                posicion += 36;
                if (file.getFilePointer() == file.length()) break;
            }
        }
    }
}