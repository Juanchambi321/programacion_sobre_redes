package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio2_b {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            ps.print("Ingrese el primer número: ");
            double n1 = Double.parseDouble(br.readLine().trim());

            ps.print("Ingrese el segundo número: ");
            double n2 = Double.parseDouble(br.readLine().trim());

            ps.print("Ingrese el tercer número: ");
            double n3 = Double.parseDouble(br.readLine().trim());

            ps.print("Ingrese el cuarto número: ");
            double n4 = Double.parseDouble(br.readLine().trim());

            double menor = n1;

            if (n2 < menor) menor = n2;
            if (n3 < menor) menor = n3;
            if (n4 < menor) menor = n4;

            ps.println("\nEl número menor es: " + menor);

        } catch (IOException e) {
            ps.println("Error en la lectura.");
        } catch (NumberFormatException e) {
            ps.println("error");
        }
    }
}
