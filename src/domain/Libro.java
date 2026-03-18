package domain;

public class Libro extends MaterialBiblioteca {
    public Libro(String titulo) {
        super(titulo);
    }

    @Override
    public String getInfo() {
        return "Libro: " + titulo;
    }

    @Override
    public double calcularMultaPorDia() {
        return 1.50;
    }
}