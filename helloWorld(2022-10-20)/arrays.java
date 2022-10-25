public class arrays {
    public static void main(String[] args) {
        // strings
        String[] cars = { "BMW", "Ford", "Nissan" };

        // integers
        int[] numbers = { 5, 10, 15 };

        // printing a specific array value
        System.out.println(cars[1]);
        System.out.println(numbers[0]);

        // changing an array value
        cars[1] = "Merc";
        System.out.println(cars[1]);

        // printing array length
        System.out.println(cars.length);

        // Looping through an array.
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " "); // Use "print" to not print a new line.
        }

        // Multidimensional

        int[][] moreNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };
        int x = moreNumbers[1][2]; // second row, third column
        System.out.println();
        System.out.println(x);

    }
}
