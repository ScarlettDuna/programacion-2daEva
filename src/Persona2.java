import java.io.*;

public class Persona2 implements Serializable {
    private String nombre;
    private int edad;

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona2() {
        this.nombre = null;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona2 persona;
        // Declaración fichero
        File fichero = new File("FichPersona.dat");
        FileOutputStream fileout = new FileOutputStream(fichero);
        ObjectOutputStream dataOS = new ObjectOutputStream((fileout));

        String[] nombres = {"Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel", "Andrés", "Julio", "Antonio", "María Jesús"};
        int[] edades = {14, 15, 13, 15, 16, 12, 16, 14, 13};

        for (int i = 0; i < edades.length; i++) {
            persona = new Persona2(nombres[i], edades[i]);
            dataOS.writeObject(persona);
        }
        dataOS.close();

        FileInputStream filein = new FileInputStream(fichero);
        ObjectInputStream dataIS = new ObjectInputStream(filein);

        try {
            while (true) {
                persona = (Persona2) dataIS.readObject();
                System.out.printf("Nombre; %s, edad: %d %n", persona.getNombre(), persona.getEdad());
            }
        } catch (EOFException eo) {
            System.out.println("Fin de lectura.");
        }
        dataIS.close();
    }

}
