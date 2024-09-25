package models;

public class Juridico extends Contribuinte {
    private String cnpj;
    private double gastosPessoal;
    private double gastosEqui;

    public Juridico(String cnpj, double gastosPessoal, double gastosEqui) {
        this.cnpj = cnpj;
        this.gastosPessoal = gastosPessoal;
        this.gastosEqui = gastosEqui;
    }

    @Override
    public double fornecaImposto() {
        double renda = getRendaBrutaAnual();

        if (renda > 200000D) {
            return renda * 0.3;
        }

        if (renda >= 100000D) {
            return renda * 0.1;
        }

        return renda * 0.05;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getGastosPessoal() {
        return gastosPessoal;
    }

    public void setGastosPessoal(double gastosPessoal) {
        this.gastosPessoal = gastosPessoal;
    }

    public double getGastosEqui() {
        return gastosEqui;
    }

    public void setGastosEqui(double gastosEqui) {
        this.gastosEqui = gastosEqui;
    }
}
