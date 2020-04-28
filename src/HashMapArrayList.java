import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapArrayList {
    public static void main(String args[]) {
        HashMap<String, ArrayList<String>> groceryList = new HashMap<String, ArrayList<String>>();
        ArrayList<String> daires = new ArrayList<String>();
        ArrayList<String> veggies = new ArrayList<String>();
        ArrayList<String> meat = new ArrayList<String>();

        // initialize array lists
        daires.add("milk");
        daires.add("cheese");

        veggies.add("carrots");
        veggies.add("lettuce");
        veggies.add("onions");
        veggies.add("potatoes");

        meat.add("beef");
        meat.add("pork");
        meat.add("chicken");

        // assign each array list with its key value in a hashmap
        groceryList.put("daires", daires);
        groceryList.put("veggies", veggies);
        groceryList.put("meat", meat);

        // print out the grocery list
        for (Map.Entry<String, ArrayList<String>> item : groceryList.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        // print out the size of meal array list
        ArrayList<String> firstList = groceryList.get("meat");
        System.out.println("\nmeat has " + firstList.size() + " items\n");

        for (Map.Entry<String, ArrayList<String>> item : groceryList.entrySet()) {
            System.out.println(item.getKey() + " has " + item.getValue().size() + " items");
            System.out.println(item.getValue());
        }

        // print the first item of each category
        int index = 0;
        for (Map.Entry<String, ArrayList<String>> item : groceryList.entrySet()) {
                System.out.println("The first item in " + item.getKey() + " is " + item.getValue().get(index));
        }
    }
}