package exercicio05;

public class Furniture extends Product {
    private String material;

    Furniture(String name, String brand, Double price, Category category, Unit unit, String material) {
        super(name, brand, price, category, unit);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Name: " + getName()  + "\nBrand: " + getBrand() + "\nPrice: " + getPrice() + "\nCategory: " + getCategory() + "\nUnit: " + getUnit() + "\nMaterial: " + getMaterial();
    }    
}
