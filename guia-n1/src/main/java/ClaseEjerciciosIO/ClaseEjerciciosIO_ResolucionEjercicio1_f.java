package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio1_f {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        try {
            ps.print("Ingrese el precio del artículo: ");
            String precioStr = "";
            int i;
            while ((i = System.in.read()) != 13) {
                precioStr += (char) i;
            }

            double precio = Double.parseDouble(precioStr.trim());

            
            double plan1 = precio * 0.90;

            double Plan2 = precio * 1.10;
            double contado2 = Plan2 * 0.50;
            double cuota2 = (Plan2 * 0.50) / 2;

            double Plan3 = precio * 1.15;
            double contado3 = Plan3 * 0.25;
            double cuota3 = (Plan3 * 0.75) / 5;

            double Plan4 = precio * 1.25;
            double primeras4 = (Plan4 * 0.60) / 4;
            double ultimas4 = (Plan4 * 0.40) / 4;

            ps.printf("\nPlan 1: Al contado con 10%% de descuento: $%.2f\n", plan1);

            ps.printf("\nPlan 2:\n  Contado 50%%: $%.2f\n  2 cuotas de: $%.2f\n", contado2, cuota2);

            ps.printf("\nPlan 3:\n  Contado 25%%: $%.2f\n  5 cuotas de: $%.2f\n", contado3, cuota3);

            ps.printf("\nPlan 4:\n  4 cuotas de: $%.2f\n  y luego 4 cuotas de: $%.2f\n", primeras4, ultimas4);

        } catch (IOException | NumberFormatException e) {
            psErr.println("Error .");
        }
    }
}
