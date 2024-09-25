public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Veja", "1234567890", 100.00, new Categoria("Limpeza"));

        System.out.println(produto.getNome());
        System.out.println(produto.getCodigo());
        System.out.println(produto.getPreco());
        System.out.println(produto.getCategoria());
    }
}