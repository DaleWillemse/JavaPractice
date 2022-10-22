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

    }
}
