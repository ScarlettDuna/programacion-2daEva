public class Rectangulo {
    double largo;
    double ancho;
    public Rectangulo(double largo, double ancho) {
        if (largo >= 0) {
            this.largo = largo;
        } else {
            this.largo = 0;
        }
        if (ancho >= 0) {
            this.ancho = ancho;
        } else {
            this.ancho = 0;
        }
    }
    public double area() {
        return this.ancho * this.largo;
    }
    public double perimetro() {
        return (this.ancho * 2) + (this.largo * 2);
    }
    public void verticalOrHorizontal(){
        if (this.ancho > this.largo) {
            System.out.println("Es vertical");
        } else {
            System.out.println("Es horizontal");
        }
    }
    public void imprimirDimensiones() {
        System.out.println("Las dimensiones del rectángulo son: \n largo: " + this.largo + "\n ancho: " + this.ancho + "\n área: " + this.area() + "\n perímetro: " + this.perimetro());
    }
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(3, 6);
        miRectangulo.imprimirDimensiones();
    }
}
