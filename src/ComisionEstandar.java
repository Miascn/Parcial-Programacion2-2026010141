public class ComisionEstandar implements EstrategiaComision {

    private static final double PORCENTAJE = 0.05;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE;
    }
}
