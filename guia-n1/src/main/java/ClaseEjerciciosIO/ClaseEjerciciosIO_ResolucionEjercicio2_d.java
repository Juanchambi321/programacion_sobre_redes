package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio2_d {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            ps.print("Ingrese el primer número real: ");
            double num1 = Double.parseDouble(br.readLine().trim());

            ps.print("Ingrese el segundo número real: ");
            double num2 = Double.parseDouble(br.readLine().trim());

            double mayor = Math.max(num1, num2);
            double menor = Math.min(num1, num2);

            if (menor == 0) {
                ps.println("No se puede dividir por cero.");
            } else if (mayor % menor == 0) {
                ps.println("El mayor es divisible por el menor.");
            } else {
                ps.println("El mayor NO es divisible por el menor.");
            }

        } catch (IOException | NumberFormatException e) {
            ps.println("Error");
        }
    }

}
