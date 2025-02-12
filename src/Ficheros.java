import java.io.File;
import java.util.Arrays;

public class Ficheros {
    public static void main(String[] args) {
        File fichero1 = new File("ejemplo1.txt");
        File directorio = new File("C:\\Users\\Usuario_Mañana\\IdeaProjects\\SegundoTrimestre");
        File fichero2 = new File(directorio, "ejemplo2.txt");
        String [] listaSegundoTrimestre = directorio.list();
        System.out.println(Arrays.toString(listaSegundoTrimestre));
    }
}
