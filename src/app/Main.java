package app; // El paquete que ya tienes

import domain.Libro; 
import domain.Revista;
import domain.DVD;
import domain.MaterialBiblioteca;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaterialBiblioteca> inventario = new ArrayList<>();

        // Instancias
        inventario.add(new Libro("Cien años de soledad"));
        inventario.add(new Libro("1984"));
        inventario.add(new Revista("National Geographic"));
        inventario.add(new Revista("Scientific American"));
        inventario.add(new DVD("Inception"));
        inventario.add(new DVD("The Matrix"));

        double multaTotal = 0;
        int diasVencidos = 5;

        System.out.println("--- Inventario Polimórfico ---");
        for (MaterialBiblioteca m : inventario) {
            System.out.println(m.getInfo());
            multaTotal += (m.calcularMultaPorDia() * diasVencidos);
        }

        System.out.println("\nMulta total (5 días): $" + multaTotal);
    }
}