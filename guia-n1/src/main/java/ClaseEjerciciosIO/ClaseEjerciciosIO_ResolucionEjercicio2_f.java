package ClaseEjerciciosIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio2_f {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            ps.print("Ingrese el nombre de la primera persona: ");
            String nom1 = br.readLine().trim();

            ps.print("Ingrese el apellido de la primera persona: ");
            String apellido1 = br.readLine().trim();

            ps.print("Ingrese el nombre de la segunda persona: ");
            String nom2 = br.readLine().trim();

            ps.print("Ingrese el apellido de la segunda persona: ");
            String apellido2 = br.readLine().trim();

            int largo1 = apellido1.length();
            int largo2 = apellido2.length();

            ps.println();
            if (largo1 > largo2) {
                ps.println("El apellido más largo es: " + apellido1 );
            } else if (largo2 > largo1) {
                ps.println("El apellido más largo es: " + apellido2 );
            } else {
                ps.println("Ambos apellidos tienen la misma longitud: " + largo1 + " letras.");
            }

        } catch (IOException e) {
            System.err.println("Error.");
        }
    }
}
