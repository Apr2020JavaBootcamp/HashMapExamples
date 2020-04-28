import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasic {
    public static void main(String args[])
    {
        HashMap<String, String> myBooks = new HashMap<String, String> ();
        myBooks.put("Charles Dickens", "Great Expectation");
        myBooks.put("Ernest Hemingway", "The Old Man and the Sea");
        myBooks.put("Harper Lee", "To Kill A Mockingbird");
        System.out.println("myBooks: \n" + myBooks);

        String title1 = myBooks.get("Harper Lee");
        String title2 = myBooks.get("John Doe");
        System.out.println("Harper Lee:" + title1 + "***");
        System.out.println("John Doe:" + title2 + "***");

        System.out.println("\nContains Charles Dicken? " + myBooks.containsKey("Charles Dicken"));
        System.out.println("Contains Charles Dickens? " + myBooks.containsKey("Charles Dickens"));

        myBooks.replace("Charles Dickens", "A Christmas Carol");
        System.out.println("\nafter replace... \nmyBooks are " + myBooks);

        myBooks.remove("Harper Lee");
        System.out.println("\nafter remove... \nmyBooks are " + myBooks);

        System.out.println("\nUsing while loop");
        Iterator books = myBooks.entrySet().iterator();
        while (books.hasNext()) {
            Map.Entry mapElement = (Map.Entry)books.next();
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }

        System.out.println("\nUsing Enhanced For Loop!");
        for (Map.Entry<String, String> book : myBooks.entrySet()) {
            System.out.println(book.getKey() + " : " + book.getValue());
        }
    }
}
