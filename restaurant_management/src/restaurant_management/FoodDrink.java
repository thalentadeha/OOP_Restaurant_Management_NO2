package restaurant_management;

import java.text.NumberFormat;

public class FoodDrink {
    private String name;
    private String category;
    private double price;
    private int quantity;
    NumberFormat numForm = NumberFormat.getCurrencyInstance();

    public FoodDrink(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return name + "\t" + numForm.format(price) + "\t";
    }

    // public static class Appetizer extends FoodDrink {
    // public Appetizer(String name, String category, double price, int quantity) {
    // super(name, price, category, quantity);
    // }

    // @Override
    // String category() {
    // return "Appetizer";
    // }
    // }

    // public static class MainCourse extends FoodDrink {
    // public MainCourse(String name, String category, double price, int quantity) {
    // super(name, price, category, quantity);
    // }

    // @Override
    // String category() {
    // return "Main Course";
    // }
    // }

    // public static class Dessert extends FoodDrink {
    // public Dessert(String name, String category, double price, int quantity) {
    // super(name, price, category, quantity);
    // }

    // @Override
    // String category() {
    // return "Dessert";
    // }
    // }

    // public static class Beverages extends FoodDrink {
    // public Dessert(String name, String category, double price, int quantity) {
    // super(name, price, category, quantity);
    // }

    // @Override
    // String category() {
    // return "Beverages";
    // }
    // }
}