public class Automovil {

    enum TipoCombustible { GASOLINA, BIOETANOL, DIESEL, BIODISESEL, GAS_NATURAL }
    enum TipoAutomovil { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    enum TipoColor { BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA }

    // Atributos
    String marca;
    int modelo;
    int motor;
    TipoCombustible tipoCombustible;
    TipoAutomovil tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    TipoColor color;
    int velocidadActual = 0;

    // Constructor
    public Automovil(String marca, int modelo, int motor, TipoCombustible tipoCombustible,
                     TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,
                     int velocidadMaxima, TipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    // Métodos Get y Set
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getModelo() { return modelo; }
    public void setModelo(int modelo) { this.modelo = modelo; }

    public int getMotor() { return motor; }
    public void setMotor(int motor) { this.motor = motor; }

    public TipoCombustible getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(TipoCombustible tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public TipoAutomovil getTipoAutomovil() { return tipoAutomovil; }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) { this.tipoAutomovil = tipoAutomovil; }

    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

    public int getCantidadAsientos() { return cantidadAsientos; }
    public void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }

    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public TipoColor getColor() { return color; }
    public void setColor(TipoColor color) { this.color = color; }

    public int getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(int velocidadActual) { this.velocidadActual = velocidadActual; }

    // Métodos funcionales
    public void acelerar(int incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }

    public void desacelerar(int decremento) {
        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(int distanciaKm) {
        if (velocidadActual > 0)
            return (double) distanciaKm / velocidadActual;
        else {
            System.out.println("Velocidad actual es 0, no se puede calcular el tiempo de llegada.");
            return -1;
        }
    }

    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
    }
}
