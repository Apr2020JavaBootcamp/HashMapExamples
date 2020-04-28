import java.util.ArrayList;

public class JustArrayList {
    public static void main (String args[])
    {
        ArrayList<String> daires = new ArrayList<String>();
        ArrayList<String> veggies = new ArrayList<String>();
        ArrayList<String> meat = new ArrayList<String>();

        daires.add("milk");
        daires.add("cheese");

        veggies.add("carrots");
        veggies.add("lettuce");
        veggies.add("onions");
        veggies.add("potatoes");

        meat.add("beef");
        meat.add("pork");
        meat.add("chicken");

        // print out the grocery list
        System.out.println("daires: " + daires);
        System.out.println("veggies: " + veggies);
        System.out.println("meat: " + meat);

        // print out the meat list
        for (String item : meat)
            System.out.println(item);

        // find out the total number of each category
        System.out.println("\ndaires has " + daires.size() + " items");
        System.out.println("veggies has " + veggies.size() + " items");
        System.out.println("meat has " + meat.size() + " items");


        // print the first item of each category
        int index = 0;
        System.out.println("\nfirst item in daires is " + daires.get(0));
        System.out.println("first item in veggies is " + veggies.get(0));
        System.out.println("first item in meat is " + meat.get(0));

    }
}
