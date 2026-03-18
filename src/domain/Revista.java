package domain;

public class Revista extends MaterialBiblioteca {
    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public String getInfo() {
        return "Revista: " + titulo;
    }

    @Override
    public double calcularMultaPorDia() {
        return 0.50;
    }
}
