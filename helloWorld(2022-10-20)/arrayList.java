import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); // creating a list.

        names.add("John Doe"); // use .add to add data to list.
        names.add("Marnus Jacobus");
        names.add("Dale Willemse");

        for (String name : names) { // foreach loop to display data stored in list.
            System.out.println(name);
        }
        System.out.println(names.size()); // .size() to find the size of the loop.
    }
}