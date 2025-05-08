package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;



public class ClaseEjerciciosIO_ResolucionEjercicio2_a {
	
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] apellidos = new String[3];

            for (int i = 0; i < 3; i++) {
                ps.print("Ingrese apellido " + (i + 1) + ": ");
                apellidos[i] = br.readLine().trim();
            }

            Arrays.sort(apellidos);

            ps.println("\nApellidos ordenados alfabéticamente:");
            for (String apellido : apellidos) {
                ps.println(apellido);
            }

        } catch (IOException e) {
            ps.println("Error ");
        }
    }


}
