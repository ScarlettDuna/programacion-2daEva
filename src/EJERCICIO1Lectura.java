import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EJERCICIO1Lectura {
    public static void main(String[] args) throws IOException {
        // Lectura archivo
        File fruteriaArantxa = new File("Fruteria_Arantxa.dat");
        RandomAccessFile file = new RandomAccessFile(fruteriaArantxa, "r");
        int posicion = 0;
        int codProducto, borrLogico;
        double precios;
        boolean stocks;
        char[] nombreProd = new char[16];
        char[] grupos = new char[12];
        char aux;
        for (; ; ) {
            file.seek(posicion);
            codProducto = file.readInt();
            for (int i = 0; i < nombreProd.length; i++) {
                aux = file.readChar();
                nombreProd[i] = aux;
            }
            for (int i = 0; i < grupos.length; i++) {
                aux = file.readChar();
                grupos[i] = aux;
            }
            String nombreProducto = new String(nombreProd);
            String grupoProducto = new String(grupos);
            precios = file.readDouble();
            stocks = file.readBoolean();
            borrLogico = file.readInt();
            System.out.println("Código producto: " + codProducto + ", Nombre: " + nombreProducto + ", Grupo: " +
                    grupoProducto + ", Precio: " + precios + ", Stock " + stocks + ", Borrado lógigo: " + borrLogico);
            posicion += 73;
            if (file.getFilePointer() == file.length()) break;
        }
    }
}
