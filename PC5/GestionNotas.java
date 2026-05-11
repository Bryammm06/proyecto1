import java.util.ArrayList;
import java.util.Scanner;

public class GestionNotas {
    
    // 1. SOBRECARGA DE MÉTODOS
    public double promediar(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public double promediar(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // 2. COLECCIONES Y MANEJO DE ERRORES
    public void registrarNotas(String[] notasInput) {
        ArrayList<Double> notasFinales = new ArrayList<>();

        for (String dato : notasInput) {
            try {
                double nota = Double.parseDouble(dato);
                notasFinales.add(nota);
            } catch (NumberFormatException e) {
                // 3. MANEJO DE ERRORES
                System.out.println("Error: '" + dato + "' no es un número válido.");
            }
        }
        System.out.println("Notas procesadas en la lista: " + notasFinales);
    }

    public static void main(String[] args) {
        GestionNotas sistema = new GestionNotas();
        
        // Probando Sobrecarga
        System.out.println("Promedio de 2 notas (15, 17): " + sistema.promediar(15, 17));
        System.out.println("Promedio de 3 notas (14, 16, 18): " + sistema.promediar(14, 16, 18));
        
        // Probando Colecciones y Errores
        String[] datosPrueba = {"15.5", "abc", "19", "8.5"};
        System.out.println("\nProcesando lista de notas con posibles errores...");
        sistema.registrarNotas(datosPrueba);
    }
}