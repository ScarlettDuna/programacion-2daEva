import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFichAleatorio {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        // arrays con los datos
        String[] apellido = {"FERNANDEZ","GIL","LOPEZ","RAMOS", "SEVILLA","CASILLA", "REY"};
        int[] dep = {10, 20, 10, 10, 30, 30, 20};
        Double[] salario = {1000.45, 2400.60, 3000.0, 1500.56, 2200.0, 1435.87, 2000.0};
        StringBuffer buffer = null;
        int n = apellido.length; // número de elementos del array
        for (int i = 0; i < n; i++) {
            file.writeInt(i + 1);
            buffer = new StringBuffer ( apellido[i]);
            buffer.setLength(10);
            file.writeChars(buffer.toString());
            file.writeInt(dep[i]);
            file.writeDouble(salario[i]);
        }
        file.close();

    }
}
