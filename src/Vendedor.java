public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia != null ? estrategia : new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        double comision = (estrategia != null) ? estrategia.calcularComision(ventasMes) : 0.0;
        String nombreEstrategia = (estrategia != null) ? estrategia.getClass().getSimpleName() : "Ninguna";

        System.out.println("==========================================");
        System.out.println("           DETALLE DEL VENDEDOR           ");
        System.out.println("==========================================");
        System.out.println("Nombre: " + nombre);
        System.out.printf("Venta Total del Mes: $%.2f%n", ventasMes);
        System.out.println("Estrategia Aplicada: " + nombreEstrategia);
        System.out.printf("Comisión Calculada:  $%.2f%n", comision);
        System.out.printf("Ingreso Total (Ventas + Com.): $%.2f%n", (ventasMes + comision));
        System.out.println("==========================================");
    }
}
