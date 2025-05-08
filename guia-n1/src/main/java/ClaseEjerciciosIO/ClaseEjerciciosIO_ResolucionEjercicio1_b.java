package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio1_b {
	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        try {
     
            ps.print("Ingrese el primer ángulo: ");
            String ang1 = "";
            int ch;
            while ((ch = System.in.read()) != 13 ) {
                ang1 += (char) ch;
            }

      
            ps.print("\nIngrese el segundo ángulo: ");
            String ang2 = "";
            int no;
            while ((no = System.in.read()) != 13) {
                ang2 += (char) no;
            }

            
            int a1 = Integer.parseInt(ang1.trim());
            int a2 = Integer.parseInt(ang2.trim());
            int anguloRestante = 180 - a1 - a2;

            ps.printf("El ángulo restante es: %d°\n", anguloRestante);

        } catch (IOException | NumberFormatException e) {
            psErr.println("Error ");
        }

	}
}
