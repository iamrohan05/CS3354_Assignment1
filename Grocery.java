package CS3354_Assignment1;

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

        printInventory(itemNames, itemPrices, itemStocks);
    }
}
