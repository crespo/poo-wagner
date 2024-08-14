import java.util.Arrays;

public class Categoria {
    private String categoria;
    final String[] categorias = {
            "Limpeza",
            "Comida",
            "Ração",
            "Utensílios Domésticos"
    };

    Categoria(String categoria) {
        if(Arrays.asList(categorias).contains(categoria)) {
            this.categoria = categoria;
        }
    }

    public String getCategoria() {
        return categoria;
    }
}
