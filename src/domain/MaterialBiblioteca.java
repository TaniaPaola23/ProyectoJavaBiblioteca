package domain;

public abstract class MaterialBiblioteca {
    protected String titulo;

    public MaterialBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    public abstract String getInfo();
    public abstract double calcularMultaPorDia();
}