import java.util.Arrays;

public class JustArray {
    public static void main (String args[])
    {
        String daires[] = {"milk", "cheese"};
        String veggies[] = {"carrots", "lettuce", "onions", "potatoes"};
        String meat[] = {"beef", "pork", "chicken"};

        // print out the grocery list
        System.out.println("daires: " + Arrays.toString(daires));
        System.out.println("veggies: " + Arrays.toString(veggies));
        System.out.println("meat: " + Arrays.toString(meat));

        // find out the total number of each category
        System.out.println("\ndaires has " + daires.length + " items");
        System.out.println("veggies has " + veggies.length + " items");
        System.out.println("meat has " + meat.length + " items");

        // print the first item of each category
        int index = 0;
        System.out.println("\nfirst item in daires is " + daires[index]);
        System.out.println("first item in veggies is " + veggies[index]);
        System.out.println("first item in meat is " + meat[index]);
    }
}
