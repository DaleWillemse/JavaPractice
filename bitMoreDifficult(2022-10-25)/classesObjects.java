class NewClass { // creating another class within the same file.
    int x = 4;
}

class ClassesObjects { // creating a new class.
    int x = 5; // variable stored in the class.

    public static void main(String[] args) {
        ClassesObjects newObject = new ClassesObjects(); // creating a new object.
        System.out.println(newObject.x); // calling the variable stored in the class, using the object.

        NewClass secondObject = new NewClass();
        System.out.println(secondObject.x); // creating a new object to call the class outside of this class.
    }
}
