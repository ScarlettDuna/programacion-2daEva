import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFicheroBytes {
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\Users\\Usuario_Mañana\\Documents\\Programación\\Segunda_Evaluación\\data.txt");
        FileOutputStream fileout = new FileOutputStream(fichero);
        FileInputStream filein = new FileInputStream(fichero);
        for (int i = 1; i <= 100; i++) {
            fileout.write(i);
        }
        fileout.close();
        int byteRead;
        while ((byteRead = filein.read()) != -1) {
            System.out.println(byteRead);
        }
        filein.close();

    }
}
