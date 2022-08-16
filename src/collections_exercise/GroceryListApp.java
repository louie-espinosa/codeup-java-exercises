//package collections_exercise;
//
//import util.Input;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class GroceryListApp {
//    public static final int PRODUCE = 1;
//
//    public static final int MEATZ = 2;
//
//    private static Input input = new Input();
//
//    //MAIN
//    public static void main(String[] args) {
//        //prompt user for interest in making a grocery list.
//
//        if(input.yesNo("Would you like to create a grocery list? y/n ") == false) {
//            System.out.println("Bye");
//            return;
//        }
//
//        //ask user to keep inputtng items until they are done
//        ArrayList<GroceryItem> groceries = getGroceryListFromUser();;//tuck it away in a function below
//
//        //if we got here, then user is done inputting items
//        printGroceryList(groceries);
//
//        System.out.println("Done");
//    }
//    private static ArrayList<GroceryItem> getGroceryListFromUser() {
//        ArrayList<GroceryItem> groceries = new ArrayList<>();
//
//        //Keep asking the user to input items until he/she says done
//        while(true) {
//            printGroceryCategories();
//
//            int categoryNum = input.getInt(1, 2, "Enter the number of the category: ");
//
//            System.out.print("Enter the name of the item: ");
//            String itemName = input.getString();
//
//            int itemQty = input.getInt(0, 10000, "Enter the quantity of the item: ");
//            //now that we have the 3 pieces of info for item, make the item
//            GroceryItem item = new GroceryItem(itemName, categoryNum, itemQty);
//            groceries.add(item);
//
//            if(input.yesNo("Would you like to add another grocery item? y/n ") == false) {
//                return groceries;
//            }
//        }
//
//    }
//
//    private static void printGroceryCategories() {
//        System.out.println("Grocery Categories: ");
//        System.out.println("1. Produce");
//        System.out.println("2. Meatz");
//    }
//    private static void printGroceryList
//            (ArrayList<GroceryItem> groceries) {
//        //1. for each category
//        printGroceryListByCategory(PRODUCE, groceries);
//        printGroceryListByCategory(MEATZ, groceries);
//        //2. fetch the grocery items for that category
//        ArrayList<GroceryItem> sortedItems = new ArrayList<>();
//        for(GroceryItem groceryItem : groceries) {
//            if(groceries.getCategoryNum() == category) {
//                sortedItems.add(groceryItem);
//            }
//        }
//        //3. sort them alphabetically
//        collections.sort(categoryItems);
//        //4. print them with quantity
//        if(category == PRODUCE) {
//
//        }
//        System.out.println(categoryItems);
//    }
//}
