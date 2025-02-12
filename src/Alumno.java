public class Alumno {
    String nombre;
    float nota;
    public Alumno(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getNota() {
        return this.nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public boolean estaAprobado(){
        return this.nota >= 5;
    }
    public void publicarNota(){
        if (this.estaAprobado()) {
            System.out.println("La nota de " + this.nombre + " es " + this.nota + " por lo que está aprobado/a.");
        } else {
            System.out.println("La nota de " + this.nombre + " es " + this.nota + " por lo que NO está aprobado/a.");
        }

    }
    public static void main(String[] args) {
        Alumno anchan = new Alumno("Anchan", 7);
        anchan.publicarNota();
    }
}
