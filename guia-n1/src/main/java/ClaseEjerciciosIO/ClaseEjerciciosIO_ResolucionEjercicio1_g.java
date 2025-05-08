package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class ClaseEjerciciosIO_ResolucionEjercicio1_g {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        Map<String, String> signos = new HashMap<>();

        signos.put("aries", "marzo - abril");
        signos.put("tauro", "abril - mayo");
        signos.put("geminis", "mayo - junio");
        signos.put("cancer", "junio - julio");
        signos.put("leo", "julio - agosto");
        signos.put("virgo", "agosto - septiembre");
        signos.put("libra", "septiembre - octubre");
        signos.put("escorpio", "octubre - noviembre");
        signos.put("sagitario", "noviembre - diciembre");
        signos.put("capricornio", "diciembre - enero");
        signos.put("acuario", "enero - febrero");
        signos.put("piscis", "febrero - marzo");

        try {
            ps.print("Ingrese su signo zodiacal: ");
            String signo = "";
            int x;
            while ((x = System.in.read()) != 13) {
                signo += (char) x;
            }

            signo = signo.trim().toLowerCase();

            if (signos.containsKey(signo)) {
                ps.printf("Mes de nacimiento aproximado: %s\n", signos.get(signo));
            } else {
                ps.println("Signo no reconocido.");
            }

        } catch (IOException e) {
            psErr.println("Error ");
        }
    }

}
