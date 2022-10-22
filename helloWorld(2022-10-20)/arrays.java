public class arrays {
    public static void main(String[] args) {
        String[] cars = { "BMW", "Ford", "Nissan" };

        int[] numbers = { 5, 10, 15 };

        System.out.println(cars[1]);
        System.out.println(numbers[0]);

        cars[1] = "Merc";
        System.out.println(cars[1]);

        System.out.println(cars.length);

    }
}
