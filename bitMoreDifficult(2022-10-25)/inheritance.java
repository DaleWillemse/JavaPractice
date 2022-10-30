class Vehicle {
    protected String brand = "Ford"; // cannot set to private, wont be able to access.
                                     // "protected" can only be accessed in the same package.

    public void hoot() {
        System.out.println("Hoot! Hoot!");
    }
}

// Use inheritance when you want to reuse code.
class Car extends Vehicle {

    private String model = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car(); // only create an object using "Car" class.

        myCar.hoot();

        System.out.println(myCar.brand + " " + myCar.model);
    }
}