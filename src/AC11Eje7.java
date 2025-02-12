import java.io.File;

public class AC11Eje7 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Usuario_Mañana\\IdeaProjects";
        File directorio = new File(ruta);
        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null && archivos.length > 0) {
                System.out.println("Archivos en el directorio " + ruta + ":");
                for (File archivo : archivos) {
                    System.out.println((archivo.isDirectory() ? "[DIR] " : "[FILE] ") + archivo.getName());
                }
            } else {
                System.out.println("El directorio está vacío.");
            }
        } else {
            System.out.println("La ruta ingresada no es un directorio válido.");
        }
    }
}
