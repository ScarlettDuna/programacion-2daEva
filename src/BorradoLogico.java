import java.io.*;
import java.util.Scanner;

public class BorradoLogico {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué empleado deseas borrar? Introduce el número de ID");
        int id = scanner.nextInt();

        StringBuffer buffer = null;
        long posicion = (id - 1) * 36;

        file.seek(posicion);
        int idBorrar = file.readInt();
        if (idBorrar != 0) {
            file.seek(posicion);
            file.writeInt(0);
            System.out.println("Empleado con ID " + id + " borrado con éxito.");
        } else {
            System.out.println("El ID " + id + " tiene ya un borrado lógico, no se puede borrar");
        }
        file.close();

    }
}
