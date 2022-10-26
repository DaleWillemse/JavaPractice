class NewClass { // creating another class within the same file.
    int x = 4;

}

class ClassesObjects { // creating a new class.

    // Difference between static and public methods.
    public void myPublicMethod() {
        System.out.println("Need an object to call a public method.");
    }

    static void myStaticMethod() {
        System.out.println("Can call method without an object");
    }

    int x = 5; // variable stored in the class.

    public static void main(String[] args) {
        ClassesObjects newObject = new ClassesObjects(); // creating a new object.
        System.out.println(newObject.x); // calling the variable stored in the class, using the object.

        NewClass secondObject = new NewClass();
        System.out.println(secondObject.x); // creating a new object to call the class outside of this class.

        secondObject.x = 20; // changing the value in the var created in the class.
        System.out.println(secondObject.x);

        // Calling public methods.
        ClassesObjects newObj = new ClassesObjects();
        newObj.myPublicMethod();
        // myPublicMethod(); creates an error.

        // Calling static methods.
        myStaticMethod();

    }
}
