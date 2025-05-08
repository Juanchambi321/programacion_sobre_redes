package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio1_e {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        try {
            ps.print("Ingrese el tiempo en segundos: ");
            String seg = "";
            int ch;

            while ((ch = System.in.read()) != 13) {
                seg+= (char) ch;
            }

            int total = Integer.parseInt(seg.trim());

            int dias = total / 86400;
            int horas = (total % 86400) / 3600;
            int minutos = (total % 3600) / 60;
            int segundos = total % 60;

            ps.printf("\nEquivale a: %d días, %d horas, %d minutos y %d segundos\n",
                      dias, horas, minutos, segundos);

        } catch (IOException | NumberFormatException e) {
            psErr.println("Error.");
        }
	}

}
