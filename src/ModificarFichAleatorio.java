import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ModificarFichAleatorio {
    public static void main(String[] args) throws IOException {
        File fichero = new File("AleatorioEmple.dat");
        RandomAccessFile file = new RandomAccessFile(fichero, "rw");

        int id = 4;
        long posicion = (id - 1) * 36;
        posicion = posicion + 4 +20;
        file.seek(posicion);
        file.writeInt(40); // modificamos el departamento a 40
        file.writeDouble(4000.87); // modificamos el salario a 4000.87
        file.close();
    }
}
