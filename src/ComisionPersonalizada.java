public class ComisionPersonalizada implements EstrategiaComision {

    private static final double PORCENTAJE = 0.10;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE;
    }
}
