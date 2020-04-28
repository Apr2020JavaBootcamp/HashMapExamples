/* colors: RGB
green: 96, 169, 23
cobalt: 0, 80, 239
pink: 244, 114, 208
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapArray {
    public static void main (String args[])
    {
        HashMap<String, int[]> colorList = new HashMap<String, int[]>();

        int green[] = {96, 169, 23};   // RGB value for green
        int cobalt[] = {0, 80, 239};
        int pink[] = {244, 114, 208};

        colorList.put("green", green);
        colorList.put("cobalt", cobalt);
        colorList.put("pink", pink);
        System.out.println(colorList);


        for (Map.Entry<String, int[]> item : colorList.entrySet()) {
            System.out.println(item.getKey() + " : " + Arrays.toString(item.getValue()));
        }


        // Q: What will be printed out???
        int color[] = {255, 0, 0};
        colorList.put("red", color);        //  "red"  : { 255, 0, 0}

        System.out.println("");
        color[1] = 255;                     // color[] = { 255, 255, 0 }
        colorList.put("yellow", color);     // "yellow" : { 255, 255, 0 }
        for (Map.Entry<String, int[]> item : colorList.entrySet()) {
            System.out.println(item.getKey() + " : " + Arrays.toString(item.getValue()));
        }

    }
}
