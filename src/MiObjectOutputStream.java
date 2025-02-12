import java.io.*;

public class MiObjectOutputStream  extends ObjectOutputStream {
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
        // Redefinición del metodo de escribir la cabecera para que no haga nada

    }

    protected void writeStreamHeader() throws IOException, SecurityException {
        File fichero = new File("data.txt");
        ObjectOutputStream dataOS;
        if (!fichero.exists()) {
            FileOutputStream fileout = new FileOutputStream(fichero);
            dataOS = new ObjectOutputStream(fileout);
        } else {
            dataOS = new MiObjectOutputStream(new FileOutputStream(fichero, true));
        }
    }
}
