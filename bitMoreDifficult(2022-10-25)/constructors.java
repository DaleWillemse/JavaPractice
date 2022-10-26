class constructors {

    int x; // creating the class attribute.

    // constructors can also have parameters.
    public constructors(int y) { // creating a class constructor.
        x = y; // set the value of the variable using a constructor.

    }

    public static void main(String[] args) {

        constructors newObj = new constructors(10);

        System.out.println(newObj.x);
    }
}