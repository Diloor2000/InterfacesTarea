package paquete;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo(5, 10);
        FiguraGeometrica triangulo = new Triangulo(4, 6);
        FiguraGeometrica circulo = new Circulo(3);

        System.out.println("Áreas de las figuras geométricas:");
        System.out.println("----------------------------------------");
        System.out.println("Rectángulo: " + rectangulo.calcularArea());
        System.out.println("----------------------------------------");
        System.out.println("Triángulo: " + triangulo.calcularArea());
        System.out.println("----------------------------------------");
        System.out.println("Círculo: " + circulo.calcularArea());
    }
}
