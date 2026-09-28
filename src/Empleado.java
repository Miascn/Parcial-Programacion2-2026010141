public abstract class Empleado {
    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    public Empleado(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    public abstract void mostrarDetalle();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public EstrategiaComision getEstrategia() {
        return estrategia;
    }
}
