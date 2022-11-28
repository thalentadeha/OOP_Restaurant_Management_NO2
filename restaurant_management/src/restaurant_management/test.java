// package restaurant_management;

// import java.text.NumberFormat;
// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.jar.Attributes.Name;

// public class Menu {
// private ArrayList<FoodDrink> appetizers = new ArrayList<FoodDrink>();
// private ArrayList<FoodDrink> maincourses = new ArrayList<FoodDrink>();
// private ArrayList<FoodDrink> desserts = new ArrayList<FoodDrink>();
// private ArrayList<FoodDrink> beverages = new ArrayList<FoodDrink>();
// private ArrayList<FoodDrink> order1 = new ArrayList<FoodDrink>();
// private static final double tax = 0.1; // pajak
// private double subtotalPrice;
// private double totalPrice;
// private NumberFormat numForm = NumberFormat.getCurrencyInstance();
// Order order = new Order();
// FoodDrink foodDrink;

// public Menu() {
// // fillMenu();
// }

// public FoodDrink getAppetizer(int i) {
// return appetizers.get(i);
// }

// public String getAppetizerList() {
// String appetizersMenu = "";
// appetizersMenu += "Appetizers : \n";
// for (int i = 0; i < appetizers.size(); i++) {
// FoodDrink a = appetizers.get(i);

// appetizersMenu += "A" + (i + 1) + " " + a.toString() + "\n";
// }

// return appetizersMenu;
// }

// public String getOrderData() {
// String order = "";
// order += "Order : \n";
// for (int i = 0; i < order1.size(); i++) {
// if (order1.get(i).getQuantity() > 0) {
// FoodDrink or = order1.get(i);

// order += "O" + (i + 1) + " " + or.toString() + or.getQuantity() + "\n";
// }
// }

// return order;
// }

// public String getMaincourseList() {
// String maincourseMenu = "";
// maincourseMenu += "Main Courses : \n";
// for (int i = 0; i < maincourses.size(); i++) {
// FoodDrink mc = maincourses.get(i);

// maincourseMenu += "M" + (i + 1) + " " + mc.toString() + "\n";
// }

// return maincourseMenu;
// }

// public String getDessertsList() {
// String dessertsMenu = "";
// dessertsMenu += "Deserts : \n";
// for (int i = 0; i < desserts.size(); i++) {
// FoodDrink d = desserts.get(i);

// dessertsMenu += "D" + (i + 1) + " " + d.toString() + "\n";
// }

// return dessertsMenu;
// }

// public String getBeveragesList() {
// String beveragesMenu = "";
// beveragesMenu += "Beverages : \n";
// for (int i = 0; i < beverages.size(); i++) {
// FoodDrink b = beverages.get(i);

// beveragesMenu += "B" + (i + 1) + " " + b.toString() + "\n";
// }

// return beveragesMenu;
// }

// public void orderMenu(int menuQuantity) {
// Scanner strscan = new Scanner(System.in);
// Scanner intscan = new Scanner(System.in);
// String menuID;

// System.out.println(toString());
// System.out.print("Order by entering the menu ID : ");
// menuID = strscan.nextLine().toUpperCase();
// char orderCat = menuID.charAt(0);// misahin char dari string menuID
// // System.out.print("CHAR " + orderCat);
// int orderID = Integer.parseInt(menuID.substring(1, menuID.length())); //
// misahin int dari string menuID
// // System.out.print("\nID " + orderID);
// System.out.print("Order quantity : ");
// int orderQuantity = intscan.nextInt();
// order.addItem(appetizers.get(1));

// if (orderCat == 'A') {
// if (appetizers.get(orderID - 1).getQuantity() > 0) {
// menuQuantity = appetizers.get(orderID - 1).getQuantity() + orderQuantity;
// appetizers.get(orderID - 1).setQuantity(menuQuantity);
// for (int i = 0; i < order1.size(); i++) {
// if (appetizers.get(orderID - 1).getName() == order1.get(i).getName()) {
// order.getItem(i).setQuantity(menuQuantity);
// }
// }
// } else {
// appetizers.get(orderID - 1).setQuantity(orderQuantity);
// order1.add(appetizers.get(orderID - 1));
// }

// menuQuantity += orderQuantity;

// } else if (orderCat == 'M') {
// if (maincourses.get(orderID - 1).getQuantity() > 0) {
// menuQuantity = maincourses.get(orderID - 1).getQuantity() + orderQuantity;
// maincourses.get(orderID - 1).setQuantity(menuQuantity);
// for (int i = 0; i < order1.size(); i++) {
// if (maincourses.get(orderID - 1).getName() == order1.get(i).getName()) {
// order.getItem(i).setQuantity(menuQuantity);
// }
// }
// } else {
// maincourses.get(orderID - 1).setQuantity(orderQuantity);
// order1.add(maincourses.get(orderID - 1));
// }

// menuQuantity += orderQuantity;

// } else if (orderCat == 'D') {
// if (desserts.get(orderID - 1).getQuantity() > 0) {
// menuQuantity = desserts.get(orderID - 1).getQuantity() + orderQuantity;
// desserts.get(orderID - 1).setQuantity(menuQuantity);
// for (int i = 0; i < order1.size(); i++) {
// if (desserts.get(orderID - 1).getName() == order1.get(i).getName()) {
// order.getItem(i).setQuantity(menuQuantity);
// }
// }
// } else {
// desserts.get(orderID - 1).setQuantity(orderQuantity);
// order1.add(desserts.get(orderID - 1));
// }
// menuQuantity += orderQuantity;

// } else if (orderCat == 'B') {
// if (beverages.get(orderID - 1).getQuantity() > 0) {
// menuQuantity = beverages.get(orderID - 1).getQuantity() + orderQuantity;
// beverages.get(orderID - 1).setQuantity(menuQuantity);
// for (int i = 0; i < order1.size(); i++) {
// if (beverages.get(orderID - 1).getName() == order1.get(i).getName()) {
// order.getItem(i).setQuantity(menuQuantity);
// }
// }
// } else {
// beverages.get(orderID - 1).setQuantity(orderQuantity);
// // order1 = (ArrayList<FoodDrink>) beverages.clone();
// order1.add(beverages.get(orderID - 1));
// }
// menuQuantity += orderQuantity;

// }
// }

// public void orderList() {
// System.out.println(getOrderData());

// System.out.println("------------------------------------------------------------------------");
// // print total price
// double subtotalPrice = 0;
// subtotalPrice = calc_subtotalPrice(0);

// System.out.printf(" Total Price before Tax : ");
// System.out.printf(numForm.format(subtotalPrice));
// System.out.println("");

// System.out.println("-------------------------------------------------------------------------");
// }

// public void addMenu() {
// Scanner strscan = new Scanner(System.in);
// Scanner dblscan = new Scanner(System.in);
// Scanner intscan = new Scanner(System.in);
// System.out.print("Enter Menu name: ");
// String name = strscan.nextLine();
// System.out.print("Enter Menu price: ");
// double price = dblscan.nextDouble();
// int choice;
// System.out.println("\n1. Appetizers");
// System.out.println("2. Main courses");
// System.out.println("3. Desserts");
// System.out.println("4. Beverages");
// System.out.print("Select food category: ");

// choice = intscan.nextInt();
// switch (choice) {
// case 1:
// appetizers.add(new FoodDrink(name + "\t\t", "Appetizers", price, 0));
// System.out.println(getAppetizerList());
// break;
// case 2:
// maincourses.add(new FoodDrink(name + "\t\t", "Main Courses", price, 0));
// System.out.println(getMaincourseList());
// break;
// case 3:
// desserts.add(new FoodDrink(name + "\t\t", "Desserts", price, 0));
// System.out.println(getDessertsList());
// break;
// case 4:
// beverages.add(new FoodDrink(name + "\t\t", "Beverages", price, 0));
// System.out.println(getBeveragesList());
// break;
// }

// System.out.println("\n\nMenu added successfully!");
// }

// public void updateMenu() {
// // pilih category yang mau diedit
// Scanner strscan = new Scanner(System.in);
// Scanner dblscan = new Scanner(System.in);
// Scanner intscan = new Scanner(System.in);
// System.out.println("Choose category to edit: ");
// System.out.println("1. Appetizers");
// System.out.println("2. Main courses");
// System.out.println("3. Desserts");
// System.out.println("4. Beverages");
// System.out.print("Enter your choice: ");
// int choice = intscan.nextInt();
// switch (choice) {
// case 1:
// System.out.println("Appetizer: ");
// System.out.println(getAppetizerList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id = intscan.nextInt();
// System.out.print("Enter new Menu name: ");
// String name = strscan.nextLine();
// System.out.print("Enter new Menu price: ");
// double price = dblscan.nextDouble();
// appetizers.get(id - 1).setName(name);
// appetizers.get(id - 1).setPrice(price);
// System.out.println("Menu edited successfully!");
// break;

// case 2:
// System.out.println("Main Course: ");
// System.out.println(getMaincourseList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id1 = intscan.nextInt();
// System.out.print("Enter new Menu name: ");
// String name1 = strscan.nextLine();
// System.out.print("Enter new Menu price: ");
// double price1 = dblscan.nextDouble();
// maincourses.get(id1 - 1).setName(name1);
// maincourses.get(id1 - 1).setPrice(price1);
// System.out.println("Menu edited successfully!");
// break;

// case 3:
// System.out.println("Desserts: ");
// System.out.println(getDessertsList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id2 = intscan.nextInt();
// System.out.print("Enter new Menu name: ");
// String name2 = strscan.nextLine();
// System.out.print("Enter new Menu price: ");
// double price2 = dblscan.nextDouble();
// desserts.get(id2 - 1).setName(name2);
// desserts.get(id2 - 1).setPrice(price2);
// System.out.println("Menu edited successfully!");
// break;

// case 4:
// System.out.println("Beverages: ");
// System.out.println(getBeveragesList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id3 = intscan.nextInt();
// System.out.print("Enter new Menu name: ");
// String name3 = strscan.nextLine();
// System.out.print("Enter new Menu price: ");
// double price3 = dblscan.nextDouble();
// beverages.get(id3 - 1).setName(name3);
// beverages.get(id3 - 1).setPrice(price3);
// System.out.println("Menu edited successfully!");
// break;

// default:
// System.out.println("Invalid choice!");
// break;
// }
// }

// public void deleteMenu() {
// Scanner intscan = new Scanner(System.in);
// System.out.println("Choose category to edit: ");
// System.out.println("1. Appetizers");
// System.out.println("2. Main courses");
// System.out.println("3. Desserts");
// System.out.println("4. Beverages");
// System.out.print("Enter your choice: ");
// int choice = intscan.nextInt();
// switch (choice) {
// case 1:
// System.out.println("Appetizers: ");
// System.out.println(getAppetizerList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id = intscan.nextInt();
// appetizers.remove(id - 1);
// System.out.println("Menu deleted successfully!");
// break;

// case 2:
// System.out.println("Main Course: ");
// System.out.println(getMaincourseList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id1 = intscan.nextInt();
// maincourses.remove(id1 - 1);
// System.out.println("Menu deleted successfully!");
// break;

// case 3:
// System.out.println("Desserts: ");
// System.out.println(getDessertsList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id2 = intscan.nextInt();
// desserts.remove(id2 - 1);
// System.out.println("Menu deleted successfully!");
// break;

// case 4:
// System.out.println("Beverages: ");
// System.out.println(getBeveragesList());
// System.out.println("------------------------------------------------------------");
// System.out.print("Enter Menu id to edit (without the letter code): ");
// int id3 = intscan.nextInt();
// beverages.remove(id3 - 1);
// System.out.println("Menu deleted successfully!");
// break;

// default:
// System.out.println("Invalid choice!");
// break;
// }
// }

// public double get_subtotalPrice() {
// return subtotalPrice;
// }

// public double get_totalPrice() {
// return totalPrice;
// }

// public double getTax() {
// return tax;
// }

// public double calc_subtotalPrice(double subtotalPrice) {
// for (int i = 0; i < order1.size(); i++) {
// if (order1.get(i).getQuantity() > 0) {
// subtotalPrice += order1.get(i).getPrice() * order1.get(i).getQuantity();
// }
// }

// return subtotalPrice;
// }

// public double calc_tax() {
// return calc_subtotalPrice(0) * tax;
// }

// public double calc_totalPrice() {
// totalPrice = calc_subtotalPrice(0) + calc_tax();
// return totalPrice;
// }

// public void clearPayments() {
// subtotalPrice = 0;
// totalPrice = 0;
// }

// public String printReceipt() {
// String str = "-------------------Payment Receipt---------------------\n"
// + "Waiter's name : " + order.getWaiters() + "\n"
// + "--------------------------------------------------------\n";
// str += order.toString();
// str += "--------------------------------------------------------\n"
// + "Subtotal : \t\t" + numForm.format(calc_subtotalPrice(0))
// + "\nTax : \t\t\t" + numForm.format(calc_tax())
// + "\nTotal : \t\t" + numForm.format(calc_totalPrice());

// return str;
// }

// // ngisi menu
// public void fillMenu() {
// // String name = "Ayam";
// // String category = "Appetizers";
// // double price = 10000;
// // appetizers
// appetizers.add(new FoodDrink("Siomay\t\t", "Appetizers", 10000, 0));
// appetizers.add(new FoodDrink("Batagor\t\t", "Appetizers", 10000, 0));
// appetizers.add(new FoodDrink("Bakwan Goreng\t", "Appetizers", 10000, 0));
// // appetizers.add(new FoodDrink(name, category, price));

// // maincourses
// maincourses.add(new FoodDrink("Sop Buntut\t\t", "Main courses", 33000, 0));
// maincourses.add(new FoodDrink("Sate Ayam\t\t", "Main courses", 25000, 0));
// maincourses.add(new FoodDrink("Ayam Goreng\t\t", "Main courses", 25000, 0));
// maincourses.add(new FoodDrink("Soto Ayam\t\t", "Main courses", 23000, 0));
// maincourses.add(new FoodDrink("Mie Goreng\t\t", "Main courses", 15000, 0));

// // desert
// desserts.add(new FoodDrink("Martabak Manis\t", "Desserts", 10000, 0));
// desserts.add(new FoodDrink("Pisang Keju\t\t", "Desserts", 10000, 0));
// desserts.add(new FoodDrink("Pisang Goreng\t", "Desserts", 10000, 0));

// // beverages
// beverages.add(new FoodDrink("Es/Panas Teh\t\t", "beverages", 5000, 0));
// beverages.add(new FoodDrink("Es/Panas Jeruk\t", "beverages", 5000, 0));
// }

// // print menu
// public String toString() {
// String menu = "";
// menu += "\t\t\tMENUS\n" +
// "----------------------------------------------------------------\n";

// menu += getAppetizerList() + "\n";
// menu += getMaincourseList() + "\n";
// menu += getDessertsList() + "\n";
// menu += getBeveragesList() + "\n";

// return menu;
// }
// }
