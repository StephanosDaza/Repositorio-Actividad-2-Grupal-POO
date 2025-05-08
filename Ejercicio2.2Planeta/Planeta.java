public class Planeta {

    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0.0;
    double volumen = 0.0;
    int diametro = 0;
    int distanciaSol = 0;
    TipoPlaneta tipo;
    boolean esObservable = false;

    enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen,
                   int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    void imprimir() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaSol + " km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable: " + esObservable);
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        double limiteUA = 149597870 * 3.4;
        return distanciaSol > limiteUA;
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12,
                                 12742, 150000000, TipoPlaneta.TERRESTRE, true);

        Planeta p2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15,
                                 139820, 750000000, TipoPlaneta.GASEOSO, true);

        p1.imprimir();
        System.out.println("Densidad: " + p1.calcularDensidad());
        System.out.println("Es planeta exterior: " + p1.esPlanetaExterior());
        System.out.println();

        p2.imprimir();
        System.out.println("Densidad: " + p2.calcularDensidad());
        System.out.println("Es planeta exterior: " + p2.esPlanetaExterior());
    }
}