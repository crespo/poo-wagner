package exercicio05;

public class Food extends Product {
    protected String dateOfManufacture;
    protected String expirationDate;

    Food(String name, String brand, Double price, Category category, Unit unit, String dateOfManufacture, String expirationDate) {
        super(name, brand, price, category, unit);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }

    public String eat() {
        return "You ate food.";
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Name: " + getName()  + "\nBrand: " + getBrand() + "\nPrice: R$ " + getPrice() + "\nCategory: " + getCategory() + "\nUnit: " + getUnit() + "\nDate of Manufacture: " + getDateOfManufacture() + "\nExpiration Date: " + getExpirationDate();
    }
}
