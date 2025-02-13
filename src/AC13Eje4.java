import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AC13Eje4 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\Users\\Usuario_Mañana\\IdeaProjects\\SegundoTrimestre\\AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        if (args.length != 1) {
            System.out.println("Debe añadir un argumento <ID empleado>");
            return;
        }
        int id;
        try {
            id = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: El ID debe ser un número entero positivo.");
            return;
        }

        long posicion = (id - 1) * 36;
        if (posicion >= file.length()) {
            System.out.println("El empleado con ID " + id + "no existe.");
            return;
        }
        file.seek(posicion);
        int idBorrar = file.readInt();
        if (idBorrar != 0 || idBorrar == -1) {
            file.seek(posicion);
            file.writeInt(-1);
            String idStr = String.format("%-10d", id);
            file.writeChars(idStr);
            file.writeInt(0);
            file.writeDouble(0.0);
            System.out.println("Empleado con ID " + id + " borrado con éxito.");
        } else {
            System.out.println("El ID " + id + " tiene ya un borrado lógico, no se puede borrar");
        }
        file.close();
    }
}
