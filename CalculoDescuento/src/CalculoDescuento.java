public class CalculoDescuento {

    /**
     * Método que calcula el descuento dado un monto total y un porcentaje específico.
     *
     * @param montoTotal El valor total de la compra.
     * @param porcentajeDescuento El porcentaje de descuento a aplicar.
     * @return El valor del descuento calculado.
     */
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    /**
     * Método sobrecargado que calcula el descuento con un 10% por defecto.
     *
     * @param montoTotal El valor total de la compra.
     * @return El valor del descuento calculado (10%).
     */
    public static double calcularDescuento(double montoTotal) {
        return montoTotal * 0.10; // 10% de descuento
    }

    public static void main(String[] args) {
        // Ejemplo 1: Usando el método sobrecargado con 10% por defecto
        double monto1 = 200.0;
        double descuento1 = calcularDescuento(monto1);
        double totalPagar1 = monto1 - descuento1;

        System.out.println("=== Cálculo con descuento del 10% por defecto ===");
        System.out.println("Monto original: $" + monto1);
        System.out.println("Descuento aplicado: $" + descuento1);
        System.out.println("Monto final a pagar: $" + totalPagar1);

        System.out.println();

        // Ejemplo 2: Usando el método con porcentaje explícito
        double monto2 = 350.0;
        double porcentaje = 15.0;
        double descuento2 = calcularDescuento(monto2, porcentaje);
        double totalPagar2 = monto2 - descuento2;

        System.out.println("=== Cálculo con descuento del " + porcentaje + "% ===");
        System.out.println("Monto original: $" + monto2);
        System.out.println("Descuento aplicado: $" + descuento2);
        System.out.println("Monto final a pagar: $" + totalPagar2);
    }
}
