import java.io.File;

public class AC11Eje8 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Debe proporcionar la ruta del directorio como argumento.");
            return;
        }
        String rutaDirectorio = args[0];
        File directorio = new File(rutaDirectorio);

        // Verificar si la ruta es un directorio válido
        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();

            if (archivos != null && archivos.length > 0) {
                System.out.println("Archivos en el directorio: " + rutaDirectorio);
                for (File archivo : archivos) {
                    System.out.println((archivo.isDirectory() ? "[DIR] " : "[FILE] ") + archivo.getName());
                }
            } else {
                System.out.println("El directorio está vacío.");
            }
        } else {
            System.out.println("Error: La ruta proporcionada no es un directorio válido o no existe.");
        }
    }
}
