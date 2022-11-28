package restaurant_management;

import java.util.Scanner;

import admin.*;

public class custMenu {

    public static void main() {
        Scanner intscan = new Scanner(System.in);
        Menu menu = new Menu();
        Order order = new Order();
        int choice;
        int menuQuantity = 0;

        // menu
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("\n==== Welcome to Sabilulungan Restaurant ====");
            System.out.println(menu);
            menu.orderList();
            System.out.println("1. Order");
            System.out.println("2. Print Receipt");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = intscan.nextInt();
            // String itemID = strscan.next().toUpperCase();
            // char itemSec = itemID.charAt(0);
            // while (!(itemSec == 'A' || itemSec == 'M' || itemSec == 'D' || itemSec ==
            // 'B')) {
            // System.out.println("Wrong input. Please enter again: ");
            // itemID = strscan.next().toUpperCase();
            // itemSec = itemID.charAt(0);
            // }
            switch (choice) {
                case 1:
                    menu.orderMenu(menuQuantity);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.println(menu.printReceipt());
                    System.out.println("Press \"ENTER\" to continue...");
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine();

                    System.out.println("Thank You For Visiting Us!");
                    menu.clearPayments();
                    System.exit(0);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong choose!");
                    break;
            }
        } while (choice != 3);

    }
}
