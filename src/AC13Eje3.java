import java.io.*;
import java.util.Scanner;

public class AC13Eje3 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        int id, dep, posicion;
        Double salario;
        char[] apellido = new char[10];
        char aux;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué empleado desea modificar?");
        int identificador = scanner.nextInt();

        System.out.println("¿Cuál es el aumento del salario?");
        double aumentoSalario = scanner.nextDouble();
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
                posicion = posicion + 4 + 20 + 4;
                file.seek(posicion);
                aumentoSalario += salario;
                file.writeDouble(aumentoSalario);
                System.out.println("ID: " + id + ", Apellido: " + apellidos + ", Departamento: " +
                        dep + ", Salario inicial: " + salario + ", Salario final: " + aumentoSalario);
            }
        }
    }
}
