package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        try {
            ps.print("Ingrese el valor por hora: ");
            String valorH = "";
            int i;
            while ((i = System.in.read()) != 13) {
                valorH += (char) i;
            }

            ps.print("\nIngrese las horas trabajadas: ");
            String horas = "";
           
            int x;
            while ((x = System.in.read()) != 13) { 
                horas += (char) x;
            }
            
            int ho = Integer.parseInt(horas.trim());

            int val = Integer.parseInt(valorH);
            //val = val + no ;
            
            int bruto = val + ho ;
            
            ps.printf("\nEl sueldo bruto es: $%d \n",bruto);

        } catch (IOException | NumberFormatException e) {
            psErr.println("Error en la entrada o conversión de datos.");
        }

	}

}
 