import java.io.*;
import java.util.Scanner;

public class EJERCICIO1Modificar {
    public static void main(String[] args) throws IOException {
        File fruteriaArantxa = new File("Fruteria_Arantxa.dat");
        RandomAccessFile file = new RandomAccessFile(fruteriaArantxa, "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el código del producto a MODIFICAR en el caso de no querer modificar introduzca el código 0");
        int codProducto = scanner.nextInt();
        if (codProducto == 0) {
            System.out.println("==================\\ Producto NO existe \\=============");
            return;
        }
        long posicion = (codProducto - 1) * 73;
        String nomProducto, grupo;
        double precio;
        boolean stock;
        int borradoLogico = 0;
        System.out.println("(41) Para modificar el NOMBRE del PRODUCTO");
        System.out.println("(42) Para modificar el GRUPO del PRODUCTO");
        System.out.println("(43) Para modificar el PRECIO");
        System.out.println("(44) Para modificar el STOCK");
        StringBuffer buffer = null;
        int menu = scanner.nextInt();
        if (menu == 41) {
            System.out.println("Escribe el nuevo NOMBRE del PRODUCTO");
            nomProducto = scanner.next();
            posicion = posicion + 4;
            file.seek(posicion);
            buffer = new StringBuffer(nomProducto);
            buffer.setLength(16);
            file.writeChars(buffer.toString());
        } else if (menu == 42) {
            System.out.println("Escribe el nuevo GRUPO del PRODUCTO");
            grupo = scanner.next();
            posicion = posicion + 4 + 32;
            file.seek(posicion);
            buffer = new StringBuffer(grupo);
            buffer.setLength(12);
            file.writeChars(buffer.toString());
        } else if (menu == 43) {
            System.out.println("Escribe el nuevo PRECIO del PRODUCTO");
            precio = scanner.nextDouble();
            posicion = posicion + 4 + 32 + 24;
            file.seek(posicion);
            file.writeDouble(precio);
        } else if (menu == 44) {
            System.out.println("Escribe el cambio de Stock");
            stock = scanner.nextBoolean();
            posicion = posicion + 4 + 32 + 24 + 8;
            file.seek(posicion);
            file.writeBoolean(stock);
        } else {
            System.out.println("Opción no válida");
            return;
        }


        file.close();

    }
}
