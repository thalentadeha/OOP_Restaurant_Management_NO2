package restaurant_management;

import java.util.Scanner;
import java.util.*;

class login {
    private String username;
    private String password;

    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}

public class SystemMain {

    static void loginAdmin() {
        int choice, count = 0;
        ArrayList<login> profile = new ArrayList<login>();
        Scanner intscan = new Scanner(System.in);
        profile.add(new login("admin", "admin12345"));
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("\n ==== Login Admin ====");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = intscan.nextInt();

            switch (choice) {
                case 1:
                    Scanner strscan = new Scanner(System.in);
                    System.out.print("Enter your username: ");
                    String username = strscan.nextLine();
                    System.out.print("Enter your password: ");
                    String password = strscan.nextLine();

                    for (login login : profile) {
                        if (login.getUsername().equals(username)
                                && login.getPassword().equals(password)) {
                            count++;
                            System.out.println("Login successfully!");
                            adminMenu.menu();
                        }
                    }
                    if (count == 0) {
                        System.out.println("Login failed!");
                    }

                    break;

                default:
                    break;
            }
        } while (choice != 2);
    }

    public static void main(String[] args) {
        int option;
        Scanner intscan = new Scanner(System.in);
        Menu.fillMenu();

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("\n==== Welcome to Sabilulungan Restaurant ====");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");
            option = intscan.nextInt();
            switch (option) {
                case 1:
                    custMenu.main();
                    break;

                case 2:
                    loginAdmin();
                    break;

                default:
                    break;
            }

        } while (option != 3);
    }
}
