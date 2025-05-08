package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio2_g {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            ps.print("Ingrese un número natural: ");
            int num = Integer.parseInt(br.readLine().trim());

            ps.println("\nTabla de multiplicar del " + num + ":");
            for (int i = 1; i <= 10; i++) {
                ps.println(num + " x " + i + " = " + (num * i));
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println("Eror.");
        }
    }

}
