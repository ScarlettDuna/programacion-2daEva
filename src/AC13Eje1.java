import java.io.*;

public class AC13Eje1 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\Users\\Usuario_Mañana\\IdeaProjects\\SegundoTrimestre\\AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");
        int id, dep, posicion;
        Double salario;
        char[] apellido = new char[10];
        char aux;

        String[] ident = args;
        int identificador = 0;
        if (ident.length > 0) {
            try {
                // Convertir el primer argumento a int
                identificador = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                // Manejar el caso en que el argumento no sea un número válido
                System.out.println("Error: El argumento no es un número válido.");
            }
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
}
