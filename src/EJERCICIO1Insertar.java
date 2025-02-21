import java.io.*;

public class EJERCICIO1Insertar {
    public static void main(String[] args) throws IOException {
        File fruteriaArantxa = new File("C:\\Users\\Usuario_Mañana\\Desktop\\AD_Arantxa\\Fruteria_Arantxa.dat");
        RandomAccessFile file = new RandomAccessFile(fruteriaArantxa, "rw");

        long posicion;
        String[] ident = args;
        int codProducto = 0;
        String nomProducto = "";
        String grupo = "";
        double precio = 0;
        boolean stock = true;
        int borradoLogico = 0;
        if (ident.length > 0) {
            try {
                codProducto = Integer.parseInt(args[0]);
                nomProducto = args[1];
                grupo = args[2];
                precio = Double.parseDouble(args[3]);
                stock = Boolean.parseBoolean(args[4]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Argumentos no válidos. Introducir: Código producto, Nombre producto, Grupo, Precio, Stock.");
                return;
            }
            posicion = (codProducto - 1) * 73;
            StringBuffer buffer = null;
            StringBuffer buffer2 = null;
            file.seek(posicion);
            file.writeInt(codProducto);
            buffer = new StringBuffer(nomProducto);
            buffer.setLength(16);
            file.writeChars(buffer.toString());
            buffer2 = new StringBuffer(grupo);
            buffer2.setLength(12);
            file.writeChars(buffer2.toString());
            file.writeDouble(precio);
            file.writeBoolean(stock);
            file.writeInt(borradoLogico);
            file.close();
        }
    }
}
