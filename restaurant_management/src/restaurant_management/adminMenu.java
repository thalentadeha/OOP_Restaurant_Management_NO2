package restaurant_management;

import java.util.Scanner;

public class adminMenu {
    Menu menu = new Menu();

    public adminMenu(Menu menu) {
        this.menu = menu;
    }

    public static void menu() {
        Menu menu = new Menu();

        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n ==== Manage Menu ====");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menu.addMenu();
                    ;
                    break;
                case 2:
                    System.out.println(menu);
                    break;
                case 3:
                    menu.updateMenu();
                    break;
                case 4:
                    menu.deleteMenu();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 5);
    }
}
