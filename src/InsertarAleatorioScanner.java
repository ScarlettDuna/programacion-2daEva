import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class InsertarAleatorioScanner {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para añadir un nuevo empleado, introduce su id.");
        int id = scanner.nextInt();
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
        file.writeInt(id);
        buffer = new StringBuffer(apellido);
        buffer.setLength(10);
        file.writeChars(buffer.toString());
        file.writeInt(dep);
        file.writeDouble(salario);
        file.close();

    }
}
