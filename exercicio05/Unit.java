package exercicio05;

import java.util.ArrayList;

public class Unit {
    private static ArrayList<String> categories = new ArrayList<String>();
    private String unit;

    public void addUnit(String unit) {
        Unit.categories.add(unit);
    }

    Unit(String unit) {
        unit = unit.toLowerCase();

        if (Unit.categories.contains(unit)) {
            System.out.println("UNIT :: Unit already exists. Setting unit.");
            this.unit = unit;
        } else {
            System.out.println("UNIT :: Creating and setting new unit.");
            addUnit(unit);
            this.unit = unit;
        }
    }

    public String getUnit() {
        return unit;
    }
}
