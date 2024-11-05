public class Main {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 142984, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        Planeta planeta2 = new Planeta("Marte", 2, 6.417E23, 1.6318E11, 6792, 228, TipoPlaneta.TERRESTRE, true, 1.88, 1.03);

        planeta1.imprimirAtributos();
        System.out.println("Densidad de " + planeta1.nombre + ": " + planeta1.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + (planeta1.esPlanetaExterior() ? "Sí" : "No"));
        System.out.println();

        planeta2.imprimirAtributos();
        System.out.println("Densidad de " + planeta2.nombre + ": " + planeta2.calcularDensidad() + " kg/km³");
        System.out.println("¿Es un planeta exterior? " + (planeta2.esPlanetaExterior() ? "Sí" : "No"));
    }
}
