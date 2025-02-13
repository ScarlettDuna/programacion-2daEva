import java.io.*;

public class AC13Eje41 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");
        int id, dep, posicion;
        Double salario;
        char[] apellido = new char[10];
        char aux;

        posicion = 0;

        for (; ; ) {
            file.seek(posicion);

            id = file.readInt();
            for (int i = 0; i < apellido.length; i++) {
                aux = file.readChar();
                apellido[i] = aux;
            }
            String apellidos = new String(apellido);
            dep = file.readInt();
            salario = file.readDouble();
            if (id == -1) {
                System.out.println("ID: " + id + ", Apellido: " + apellidos + ", Departamento: " +
                        dep + ", Salario: " + salario);

            }
        posicion += 36;
        if (file.getFilePointer() == file.length()) break;
        }
    }
}
