package domain;

public class DVD extends MaterialBiblioteca {
    public DVD(String titulo) {
        super(titulo);
    }

    @Override
    public String getInfo() {
        return "DVD: " + titulo;
    }

    @Override
    public double calcularMultaPorDia() {
        return 3.00;
    }
}
