package CS3354_Assignment1;

import java.util.Scanner;

public class Grocery {
    public static void printInventory(String[] names, double[] prices, int[] stocks){
    for (int i=0; i<names.length;i++){
    if (names[i] != null){
    System.out.println("Name: " + names[i]);
    System.out.println("Price: " + prices[i]);
    System.out.println("Stock: " + stocks[i]);
    }
    }   
}

 public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println("Stock updated for " + names[i]);
                return;
            }
        }
        System.out.println("Item not found.");
    }
public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apple";
        itemPrices[0] = 0.99;
        itemStocks[0] = 10;

        itemNames[1] = "Bread";
        itemPrices[1] = 2.49;
        itemStocks[1] = 15;

        itemNames[2] = "Milk";
        itemPrices[2] = 3.29;
        itemStocks[2] = 10;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Grocery Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item name: ");
                String target = scanner.nextLine();

                System.out.print("Enter amount to add: ");
                int amount = scanner.nextInt();

                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
