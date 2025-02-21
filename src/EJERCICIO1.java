import java.io.*;

public class EJERCICIO1 {
    public static void main(String[] args) throws IOException {
        File fruteriaArantxa = new File("Fruteria_Arantxa.dat");
        RandomAccessFile file = new RandomAccessFile(fruteriaArantxa, "rw");

        String[] nomProducto = {"Mandarinas", "Lechugas", "Melones", "Berenjenas", "Zanahorias", "Manzanas", "Tomates"};
        String[] grupo = {"Frutas", "Verduras", "Frutas", "Hortalizas", "Hortalizas", "Frutas", "Verduras"};
        double[] precio = {2.50, 1.25, 0.90, 2.30, 0.80, 2.40, 1.85};
        boolean[] stock = {true, false, false, true, true, true, true};
        int[] borradoLogico = {0, 0, 0, 0, 0, 0, 0};
        StringBuffer buffer = null;
        StringBuffer buffer2 = null;
        int n = nomProducto.length; // número de elementos del array
        for (int i = 0; i < n; i++) {
            file.writeInt(i + 1);
            buffer = new StringBuffer(nomProducto[i]);
            buffer.setLength(16);
            file.writeChars(buffer.toString());
            buffer2 = new StringBuffer(grupo[i]);
            buffer2.setLength(12);
            file.writeChars(buffer2.toString());
            file.writeDouble(precio[i]);
            file.writeBoolean(stock[i]);
            file.writeInt(borradoLogico[i]);
        }
        System.out.println(file.length());
    }
}

