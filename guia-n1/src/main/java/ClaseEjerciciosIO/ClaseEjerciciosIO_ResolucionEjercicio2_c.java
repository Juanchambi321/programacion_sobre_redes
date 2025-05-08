package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio2_c {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            ps.print("Ingrese un número entero: ");
            String entrada = br.readLine().trim();

            int numero = Integer.parseInt(entrada);

            if (numero % 2 == 0) {
                ps.println("El número es PAR.");
            } else {
                ps.println("El número es IMPAR.");
            }

        } catch (IOException e) {
            ps.println("Error ");
        }
    }
}
