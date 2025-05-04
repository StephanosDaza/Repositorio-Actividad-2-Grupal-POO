public class TrianguloRectangulo {
    int base, altura;

    TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2.0;
    }

    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    void determinarTipoTriangulo() {
        double h = calcularHipotenusa();
        if (base == altura && base == h)
            System.out.println("Es un triángulo equilátero");
        else if (base != altura && base != h && altura != h)
            System.out.println("Es un triángulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
    }
}
