import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Common variables
        // int a = 10;
        // int b = 5;
        // int c = 100;

        // What if we had a million vars in one easy accessible place.
        // Make use of a hashmap!
        HashMap<String, Integer> happy = new HashMap<String, Integer>(); // Use capitals as they are not primitives.

        // storing values into the hashmap
        happy.put("a", 10);
        happy.put("b", 5);
        happy.put("c", 100);

        System.out.println(happy);
        System.out.println(happy.get("c")); // Getting a specific value using a key.

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("Mark", "1234");
        fun.put("John", "password");
        fun.put("Darryl", "helloworld");
        System.out.println(fun);

        // Removing elements
        fun.remove("Mark");

        // Contains a certain value (values on the right)
        fun.containsValue("password"); // returns True or False

        // Contains a key(on the left side)
        fun.containsKey("John"); // returns True or False

        // Finding the size of the map
        fun.size();

        // Replacing values
        fun.replace("John", "newPassword"); // John replaces his password with a new password

        // Cannot rely on the order of a HashMap, rely on the keys associated with the
        // values.
    }
}
