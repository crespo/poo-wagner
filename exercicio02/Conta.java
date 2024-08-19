package exercicio02;

public class Conta {
    private Boolean tipoConta;
    private String nome;
    private String cpf;
    private Double saldo;
    private Double investimentos;

    Conta(Boolean tipoConta, String nome, String cpf) {
        this.tipoConta = tipoConta;
        this.nome = nome;
        this.cpf = cpf;
        saldo = 0.0;
        investimentos = 0.0;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void investir(Double valor) {
        investimentos += valor;
    }

    public Double sacar(Double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return valor;
        }

        return 0.0;
    }

    public Double sacarInvestimento(Double valor) {
        if (investimentos >= valor) {
            investimentos -= valor;
            return valor;
        }

        return 0.0;
    }

    public String getTipoConta() {
        if(tipoConta) {
            return "Digital";
        }

        return "Física";
    }

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getInvestimentos() {
        return investimentos;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Tipo de Conta: " + getTipoConta() + "\n" + "Saldo: R$" + getSaldo() + "\n" + "Investimentos: R$" + getInvestimentos() + "\n";
    }

}
