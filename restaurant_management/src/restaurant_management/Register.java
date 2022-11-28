package restaurant_management;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Register {
    private static final double tax = 0.1; // pajak
    private double subtotalPrice;
    private double totalPrice;
    private NumberFormat numForm = NumberFormat.getCurrencyInstance();
    Order order = new Order();
    Menu menu = new Menu();

    public Register(Menu menu) {
        this.menu = menu;
    }

    public double get_subtotalPrice() {
        return subtotalPrice;
    }

    public double get_totalPrice() {
        return totalPrice;
    }

    public double getTax() {
        return tax;
    }

    public double calc_subtotalPrice() {
        for (int i = 0; i < order.getSize(); i++) {
            FoodDrink item = order.getItem(i);
            subtotalPrice += item.getPrice();
        }

        return subtotalPrice;
    }

    public double calc_tax() {
        return subtotalPrice * tax;
    }

    public double calc_totalPrice() {
        totalPrice = subtotalPrice + calc_tax();
        return totalPrice;
    }

    public void clearPayments() {
        subtotalPrice = 0;
        totalPrice = 0;
    }

    public String toString() {
        String str = "-------------------Payment Receipt---------------------\n"
                + "Waiter's name : " + order.getWaiters() + "\n"
                + "--------------------------------------------------------\n";
        str += order.toString();
        str += "--------------------------------------------------------\n"
                + "Subtotal : \t\t" + numForm.format(calc_subtotalPrice())
                + "\nTax : \t\t" + numForm.format(calc_tax())
                + "\nTotal : \t\t" + numForm.format(calc_totalPrice());

        return str;
    }
}
