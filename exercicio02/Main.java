package exercicio02;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(true, "Raul Crespo", "123.456.789-00");
        Conta conta2 = new Conta(false, "Lorem Ipsum", "000.111.222-33");
        conta.depositar(2.89);
    
        conta2.depositar(12.00);
        conta2.investir(15000.00);
    
        System.out.println(conta);
        System.out.println(conta2);
    }
}
