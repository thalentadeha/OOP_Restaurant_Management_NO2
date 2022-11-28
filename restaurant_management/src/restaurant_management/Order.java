package restaurant_management;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Order {
    private ArrayList<FoodDrink> order = new ArrayList<FoodDrink>();

    public Order() {

    }

    // get item dari class fooddrink
    public FoodDrink getItem(int i) {
        return order.get(i);
    }

    // nambah item ke order
    public void addItem(FoodDrink item) {
        order.add(item);
    }

    // hapus semua orderan
    public void clearOrder() {
        order.clear();
    }

    // hapus item dari order
    public void removeItem(FoodDrink item) {
        order.remove(item);
    }

    public int getSize() {
        return order.size();
    }

    // waiters randomizer
    public String getWaiters() {
        Random rand = new Random();
        String waiters[] = { "Kevin", "Nabila", "Putri", "Abdul", "David" };
        int num = rand.nextInt(5) + 1;
        switch (num) {
            case 1:
                return waiters[0];

            case 2:
                return waiters[1];

            case 3:
                return waiters[2];

            case 4:
                return waiters[3];

            case 5:
                return waiters[4];

            default:
                return "no waiter available";
        }
    }

    public String toString() {
        String order1 = "";
        order1 += "Order : \n";
        for (int i = 0; i < getSize(); i++) {
            if (order.get(i).getQuantity() > 0) {
                FoodDrink or = order.get(i);

                order1 += "O" + (i + 1) + " " + or.toString() + "\n";
            }
        }

        return order1;
    }
}