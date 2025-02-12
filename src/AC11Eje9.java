import java.io.File;
import java.io.IOException;

public class AC11Eje9 {
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\ficheros";
        File directorio = new File(ruta);
        File f = new File(directorio, "datos.txt");

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado: " + ruta);
            } else {
                System.out.println("No se pudo crear el directorio.");
                return;
            }
        }

        if (f.exists()) {
            System.out.println("El fichero ya existe y su tamaño es " + f.length());
        } else {
            if (f.createNewFile()) {
                System.out.println("Fichero creado");
            } else {
                System.out.println("No se ha podido crear el fichero");
            }

        }

    }
}
