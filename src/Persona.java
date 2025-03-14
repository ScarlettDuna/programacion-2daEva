public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona:" +
                " nombre = " + nombre +
                ", edad = " + edad +
                ", mayor de edad = " + this.esMayorEdad();
    }
    public boolean esMayorEdad() {
        return this.edad >= 18;
    }
    public static void main(String[] args) {
        Persona anchan = new Persona("Anchan", 33);
        System.out.println(anchan.toString());
    }
}
