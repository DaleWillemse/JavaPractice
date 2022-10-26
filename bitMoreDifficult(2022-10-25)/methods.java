class methods {
    public static void main(String[] args) {
        newMethod(); // calling a method without any parameters.

        boolean returnValue = returnMethod(); // calling a method that returns a value.
        System.out.println(returnValue);

        int num = 1;
        int answer = fullMethod(num); // calling a method with parameters and a return value.
        System.out.println(answer);
    }

    static void newMethod() { // creating a method.
        // returns nothing. "void"
    }

    static boolean returnMethod() { // returns type "boolean".
        return false;
    }

    static int fullMethod(int num) { // takes an int and stores it as "num", returns and int.
        int answer = num + num;
        return answer;
    }

    // Method overloading.
    // methods have the same name, however the different parameters allow it to pass
    // two different values.
    static int method(int num) {
        return 2;
    }

    static float method(float num) {
        return 2.0f;
    }

}
