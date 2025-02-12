import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertarAleatoriamente {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        int id = 20;
        int dep = 10;
        Double salario = 1230.87;
        String apellido = "GONZALEZ";
        StringBuffer buffer = null;
        long posicion = (id - 1) * 36;

        file.seek(posicion);
        file.writeInt(id);
        buffer = new StringBuffer(apellido);
        buffer.setLength(10);
        file.writeChars(buffer.toString());
        file.writeInt(dep);
        file.writeDouble(salario);

    }
}
