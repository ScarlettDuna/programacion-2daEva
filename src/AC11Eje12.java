import java.io.File;

public class AC11Eje12 {
    public static void main(String[] args) {
        File directorioRaiz = new File(System.getProperty("user.dir"));
        if (directorioRaiz.exists() && directorioRaiz.isDirectory()) {
            directorioRaiz.listFiles();
        } else {
            System.out.println("No se pudo acceder al directorio raíz.");
        }

    }
}
