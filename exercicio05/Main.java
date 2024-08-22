package exercicio05;

public class Main {

    
    public static void main(String[] args) {
        Biscuit biscoitoTreloso = new Biscuit("Biscoito Recheado", "Treloso", 2.50, new Category("Alimentos"), new Unit("und"), "20240822", "20241222");
        System.out.println(biscoitoTreloso);

        Furniture cadeira = new Furniture("Cadeira", "Crespo Madeireira", 150.00, new Category("Móveis"), new Unit("und"), "Madeira");
        System.out.println(cadeira);
        
    }
    
}
