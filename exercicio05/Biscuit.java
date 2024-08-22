package exercicio05;

public class Biscuit extends Food {

    Biscuit(String name, String brand, Double price, Category category, Unit unit, String dateOfManufacture,
            String expirationDate) {
        super(name, brand, price, category, unit, dateOfManufacture, expirationDate);
    }
    
    @Override
    public String eat() {
        return "Crunch.";
    }
}
