class methods {
    public static void main(String[] args) {
        newMethod(); // calling a method without any parameters.

        boolean returnValue = returnMethod(); // calling a method that returns a value.

        int num = 1;
        int answer = fullMethod(num); // calling a method with parameters and a return value.

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

}
