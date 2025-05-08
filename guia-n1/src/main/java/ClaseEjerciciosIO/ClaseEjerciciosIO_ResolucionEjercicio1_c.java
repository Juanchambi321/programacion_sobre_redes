package ClaseEjerciciosIO;

import java.io.IOException;
import java.io.PrintStream;

public class ClaseEjerciciosIO_ResolucionEjercicio1_c {
	public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        PrintStream psErr = new PrintStream(System.err);

        try {
            ps.print("Ingrese la superficie del cuadrado en m2: ");
            String metro = "";
            int ch;
            while ((ch = System.in.read()) != 13) {
                metro += (char) ch;
            }

            metro = metro.trim(); 
            double superficie = Double.parseDouble(metro); 

            double lado = Math.sqrt(superficie);    //la raiz cuadrada ya que necesito los lados para el perimetro
            
            double perimetro = lado * 4;             	

            ps.printf("El perímetro del cuadrado es: %.2f metros\n", perimetro);

        } catch (IOException | NumberFormatException e) {
            psErr.println("Error ");
        }
    }

}
