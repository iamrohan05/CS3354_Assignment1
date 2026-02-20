package CS3354_Assignment1;

import java.util.Scanner;

/**
 * Grocery
 * 
 * A simple console-based inventory management program for a grocery store.
 * Allows viewing inventory and restocking items via user input.
 * 
 * @author Pema Lama Rohan Bhandari
 * 
 */
public class Grocery {

    /**
     * Prints the current inventory of items, including name, price, and stock.
     * 
     * @param names  Array of item names
     * @param prices Array of item prices
     * @param stocks Array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Name: " + names[i]);
                System.out.println("Price: " + prices[i]);
                System.out.println("Stock: " + stocks[i]);
            }
        }
    }

    /**
     * Restocks a specific item in the inventory by adding the specified amount.
     * If the item is not found, prints an error message.
     * 
     * @param names  Array of item names
     * @param stocks Array of item stock quantities
     * @param target Name of the item to restock (case-insensitive)
     * @param amount Quantity to add to the stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                found = true;
                System.out.println("Restocked successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    /**
     * The main method runs the program loop.
     * Initializes inventory, displays a menu, and processes user input for viewing
     * and restocking items.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Initialize some inventory items
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
            scanner.nextLine(); // consume newline

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