import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ConsultarFichAleatorio {
    public static void main(String[] args) throws IOException {

        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");
        int id, dep, posicion;
        Double salario;
        char[] apellido = new char[10];
        char aux;
        System.out.println("¿Qué empleado desea consultar?");
        Scanner scanner = new Scanner(System.in);

        int identificador = scanner.nextInt();
        posicion = (identificador - 1) * 36;
        if (posicion >= file.length()) {
            System.out.println("ID: " + identificador + ", no existe");
        } else {
            file.seek(posicion);
            id = file.readInt();
            for (int i = 0; i < apellido.length; i++) {
                aux = file.readChar();
                apellido[i] = aux;
            }
            String apellidos = new String(apellido);
            dep = file.readInt();
            salario = file.readDouble();
            if (id == 0) {
                System.out.println("ID: 0 tiene borrado lógico");
            } else {
                System.out.println("ID: " + id + ", Apellido: " + apellidos + ", Departamento: " +
                        dep + ", Salario: " + salario);
            }

        }
    }
}
