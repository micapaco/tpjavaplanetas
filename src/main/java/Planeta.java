public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0.0;
    double volumen = 0.0;
    int diametro = 0;
    int distanciaMediaSol = 0;
    TipoPlaneta tipoPlaneta;
    boolean observable = false;
    double periodoOrbital;
    double periodoRotacion;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipoPlaneta, boolean observable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia media al Sol (millones de km): " + distanciaMediaSol);
        System.out.println("Tipo de planeta: " + tipoPlaneta);
        System.out.println("Observable a simple vista: " + (observable ? "Sí" : "No"));
        System.out.println("Periodo orbital (años): " + periodoOrbital);
        System.out.println("Periodo de rotación (días): " + periodoRotacion);
        System.out.println();
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {
        double distanciaAU = distanciaMediaSol * 1_000_000 / 149_597_870.0;
        return distanciaAU > 3.4;
    }
}
