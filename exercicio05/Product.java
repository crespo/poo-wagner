package exercicio05;

public class Product {
    private String name;
    private String brand;
    private Double price;
    private Category category;
    private Unit unit;

    Product(String name, String brand, Double price, Category category, Unit unit) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category.getCategory();
    }

    public String getUnit() {
        return unit.getUnit();
    }

    @Override
    public String toString() {
        return "Name: " + getName()  + "\nBrand: " + getBrand() + "\nPrice: R$ " + getPrice() + "\nCategory: " + getCategory() + "\nUnit: " + getUnit();
    }
    
}
