package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio1_d {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        try {
            ps.print("Ingrese la temperatura en grados Fahrenheit: ");
            String tempF = "";
            int c;

            while ((c = System.in.read()) != 13) {
                tempF += (char) c;
            }

            double fahrenheit = Double.parseDouble(tempF.trim());

            double celsius = (fahrenheit - 32) * 5 / 9;

            ps.printf("\nLa temperatura en grados Celsius es: %.2f°C\n", celsius);

        } catch (IOException | NumberFormatException e) {
            psErr.println("Error en la entrada o conversión de datos.");
        }
    }

}
