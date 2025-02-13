import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AC13Eje2 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\Users\\Usuario_Mañana\\IdeaProjects\\SegundoTrimestre\\AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para añadir un nuevo empleado, introduce su id.");
        int id = scanner.nextInt();
        if (id < 1) {
            System.out.println("ID no válido, tiene que ser un número positivo ");
        }
        System.out.println("Introduce el número de departamento");
        int dep = scanner.nextInt();
        System.out.println("Introduce salario");
        Double salario = scanner.nextDouble();
        System.out.println("Introduce apellido");
        String apellidoM = scanner.next();
        // Nos aseguramos que el String introducido se guarda en mayúsculas como el resto de registros
        String apellido = apellidoM.toUpperCase();
        StringBuffer buffer = null;
        long posicion = (id - 1) * 36;

        file.seek(posicion);
        int idLeido = file.readInt();
        if (idLeido != 0) {
            System.out.println("Ya existe un empleado con ese número de empleado");
            return;
        }
        file.seek(posicion);
        file.writeInt(id);
        buffer = new StringBuffer(apellido);
        buffer.setLength(10);
        file.writeChars(buffer.toString());
        file.writeInt(dep);
        file.writeDouble(salario);
        file.close();
    }
}
