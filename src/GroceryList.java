import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        if (groceryList.size() == 1) {
            System.out.println("You have " + groceryList.size() + " thing in your list");
            System.out.println("That's: " + groceryList.get(0));
        } else {
            System.out.println("You have " + groceryList.size() + " things in your list");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". item is: " + groceryList.get(i));
            }
        }


    }


    public void modifyGL(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");

    }

    public void removeGL(int index) {
        groceryList.remove(index);
    }

    public String findItem(String searchItem) {
//        boolean exist = groceryList.contains(searchItem);
//        if (exist)
//            return searchItem;
//        else
//            return null;
//
        int position = groceryList.indexOf(searchItem);
        if(position>=0)
            return groceryList.get(position);
        else
        return Integer.toString(position);
    }

}
