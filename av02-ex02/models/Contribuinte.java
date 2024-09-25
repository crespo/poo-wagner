package models;

public abstract class Contribuinte {
    private double rendaBrutaAnual;
    private String nome;

    public abstract double fornecaImposto();

    public double getRendaBrutaAnual() {
        return rendaBrutaAnual;
    }

    public void setRendaBrutaAnual(double rendaBrutaAnual) {
        this.rendaBrutaAnual = rendaBrutaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
