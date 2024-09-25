package exercicio05;

import java.util.ArrayList;

public class Category {

    private static ArrayList<String> categories = new ArrayList<String>();
    private String category;

    public void addCategory(String category) {
        Category.categories.add(category);
    }

    Category(String category) {
        category = category.toUpperCase();

        if (Category.categories.contains(category)) {
            this.category = category;
        } else {
            addCategory(category);
            this.category = category;
        }
    }
    
    public String getCategory() {
        return category;
    }
}
