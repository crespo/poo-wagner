import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Veja", "1234567890", 100.0, new Categoria("Limpeza"));

        System.out.println(produto.getNome());
        System.out.println(produto.getCodigo());
        System.out.println(produto.getPreco());
        System.out.println(produto.getCategoria());
    }
}