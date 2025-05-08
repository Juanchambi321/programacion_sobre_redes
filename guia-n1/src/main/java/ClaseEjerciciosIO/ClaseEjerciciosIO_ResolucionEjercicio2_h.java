package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio2_h {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            ps.print("Ingrese un número natural: ");
            int num = Integer.parseInt(br.readLine().trim());

            if (num <= 1) {
                ps.println("No es un número primo.");
                return;
            }

            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                ps.println(num + " es un número primo.");
            } else {
                ps.println(num + " no es un número primo.");
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println("Entrada inválida");
        }
    }

}
