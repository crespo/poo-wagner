package models;

public class Fisico extends Contribuinte {
    private int numeroDep;
    private String cpf;
    private double gastosSaude;
    private double gastosEducacao;

    public Fisico(int numeroDep, String cpf, double gastosSaude, double gastosEducacao) {
        this.numeroDep = numeroDep;
        this.cpf = cpf;
        this.gastosSaude = gastosSaude;
        this.gastosEducacao = gastosEducacao;
    }

    @Override
    public double fornecaImposto() {
        double renda = getRendaBrutaAnual();

        if (renda > 20000D) {
            return renda * 0.25;
        }

        if (renda >= 10000D) {
            return renda * 0.1;
        }

        return 0;
    }

    public int getNumeroDep() {
        return numeroDep;
    }

    public void setNumeroDep(int numeroDep) {
        this.numeroDep = numeroDep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }

    public void setGastosEducacao(double gastosEducacao) {
        this.gastosEducacao = gastosEducacao;
    }
}
