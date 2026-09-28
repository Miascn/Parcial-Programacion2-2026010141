public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Cálculo de Comisiones de Ventas");
        System.out.println("Estudiante: Josue Jeremias Castillo Nieves | CIF: 2026010141\n");

        Vendedor vendedor = new Vendedor("Josue Castillo", 10000.0);
        vendedor.cambiarEstrategia(new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
