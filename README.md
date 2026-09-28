# Parcial - Programación 2

**Estudiante:** Josue Jeremias Castillo Nieves  
**CIF:** 2026010141  
**Repositorio:** `Parcial-Programacion2-2026010141`

---

## 📌 Descripción del Proyecto
Aplicación en Java orientada a objetos organizada con **Interfaces**, **Clases Abstractas** y el **Patrón Strategy** para calcular la comisión de ventas de un empleado.

### 📐 Arquitectura y Patrones Aplicados
1. **Patrón Strategy (`EstrategiaComision`)**:
   - `ComisionEstandar`: Retorna el 5% de la venta total.
   - `ComisionPersonalizada`: Retorna el (5 + N)% de la venta, donde N es la cantidad de letras del primer nombre (`"Josue"` -> 5 letras -> N = 5 -> Porcentaje = 10%).
2. **Clase Abstracta (`Empleado`)**:
   - Atributos encapsulados: `nombre`, `ventasMes`, `estrategia`.
   - Inyección de dependencia dinámica mediante `cambiarEstrategia(EstrategiaComision nueva)`.
   - Método abstracto `mostrarDetalle()`.
3. **Subclase Concreta (`Vendedor`)**:
   - Hereda de `Empleado`.
   - Usa por defecto la `ComisionEstandar` en la rama `main`.
   - Implementa `mostrarDetalle()` con cálculo polimórfico de la comisión.

---

## 🚀 Compilación y Ejecución

### Desde Terminal (PowerShell / CMD / Bash):
```bash
# Compilar los archivos fuente
javac -d bin src/*.java

# Ejecutar la aplicación
java -cp bin Main
```

---

## 🌿 Flujo Git y Gestión de Ramas
- **Rama `main`**: Contiene la implementación base con `ComisionEstandar` por defecto.
- **Rama `feature/comision-personalizada`**: Asigna la estrategia `ComisionPersonalizada` en `Main.java`.
- **Fusión y resolución de conflicto**: Se integró `feature/comision-personalizada` en `main` resolviendo el conflicto manualmente en `Main.java` y preservando la comisión personalizada con el commit:
  `"fix: resolver conflicto e integrar comision personalizada"`.
