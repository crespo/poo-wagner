public class Produto {
    private String nome;
    private String codigo;
    private Double preco;
    private Categoria categoria;

    Produto(String nome, String codigo, Double preco, Categoria categoria) {
        if (nome.length() >= 3 && codigo.length() >= 10 && preco > 0) {
            this.nome = nome;
            this.codigo = codigo;
            this.preco = preco;
            this.categoria = categoria;
        } else {
            System.out.println("Nome, código ou preço inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria.getCategoria();
    }


}
