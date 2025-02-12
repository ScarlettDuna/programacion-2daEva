import java.io.File;
import java.io.IOException;

public class AC11Eje10 {
    public static void main(String[] args) throws IOException {
        File ficheroPrueba = new File("testfile.txt");
        ficheroPrueba.createNewFile();
        if (ficheroPrueba.exists()) {
            ficheroPrueba.delete();
            System.out.println("Se ha borrado el archivo " + ficheroPrueba);
        } else {
            System.out.println("El fichero " + ficheroPrueba + " no existe, no se puede borrar");
        }
        ficheroPrueba.createNewFile();
        File ficheroPrueba2 = new File("testfile2.txt");
        if (ficheroPrueba.renameTo(ficheroPrueba2)){
            System.out.println("Archivo renombrado con éxito");
        } else {
            System.out.println("No se pudo renombrar el archivo");
        }
    }
}
